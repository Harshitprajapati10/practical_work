
import java.util.*;

public class Problem02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        StringBuffer tempStringBuffer;
        String inSentence;
        int numberOfCharacters;
        char letter;
        System.out.println("Sentence: ");
        inSentence = scanner.next();
        tempStringBuffer = new StringBuffer(inSentence);
        numberOfCharacters = tempStringBuffer.length();
        for (int index = 0; index < numberOfCharacters; index++) {
            letter = tempStringBuffer.charAt(index);
            if (letter == 'a' || letter == 'A'
                    || letter == 'e' || letter == 'E'
                    || letter == 'i' || letter == 'I'
                    || letter == 'o' || letter == 'O'
                    || letter == 'u' || letter == 'U') {
                tempStringBuffer.setCharAt(index, 'X');
            }
        }
        System.out.println("Input: " + inSentence);
        System.out.println("Output: " + tempStringBuffer);

        StringBuffer str
                = new StringBuffer("Caffeine");
        str.insert(0, "Dr. ");
        System.out.println(str);

        
    }
}
