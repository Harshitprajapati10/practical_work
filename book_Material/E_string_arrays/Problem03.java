
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

// WAF to find common words in files file1.txt. and file2.txt
public class Problem03 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("bad request");
            return;
        }
        try (
            FileInputStream fin1 = new FileInputStream(args[0]); FileInputStream fin2 = new FileInputStream(args[1]);) {
            String[] words1 = readWords(fin1);
            String[] words2 = readWords(fin2);
            HashSet<String> set = new HashSet<>();
            for (var w : words1) {
                if (w != null) {
                    set.add(w);
                }
            }
            System.out.println("\nCommon words:");
            for (String w : words2) {
                if (w != null && set.contains(w)) {
                    System.out.println(w);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("filenotfoundexception");
        } catch (IOException e) {
            System.out.println("I/o exception occurs");
        }
    }

    static String[] readWords(FileInputStream f) throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = f.read()) != -1) {
            sb.append((char) ch);
        }
        String content = sb.toString().trim();
        if (content.isEmpty()) {
            return new String[0];
        }

        return content.split("\\s+");
    }
}
