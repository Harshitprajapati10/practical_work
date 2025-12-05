
import java.io.*;

// find common words
public class Problem04 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("bad request");
            return;
        }

        try {
            String[] words1 = readWords(args[0]);
            String[] words2 = readWords(args[1]);

            System.out.println("Common words:");
            for (String w1 : words1) {
                if (w1 == null) {
                    break;
                }
                for (String w2 : words2) {
                    if (w2 == null) {
                        break;
                    }
                    if (w1.equals(w2)) {
                        System.out.println(w1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }

    static String[] readWords(String FileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FileName));
        String[] arr = new String[100];
        int index = 0;
        StringBuilder word = new StringBuilder();
        int ch;

        while ((ch = br.read()) != -1) {
            char c = (char) ch;
            if (c == ' ' || c == '\n' || c == '\t') {
                if (word.length() > 0) {
                    arr[index++] = word.toString();
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }

        if (word.length() > 0) {
            arr[index++] = word.toString();
        }

        br.close();
        return arr;
    }
}
