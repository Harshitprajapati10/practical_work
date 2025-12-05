
import java.util.Scanner;

// wap that requires user to enter a single character from the alphabet.Print vowel or consonant depending on user input.If the input is not a letter, or is a string of length >1, print an error message.
public class Problem01 {

    static void vowelorconso(String s) {
        if (s.length() != 1) {
            System.out.println("please enter exactly one character");
            return;
        }
        char ch = s.charAt(0);
        boolean isUpper = (ch >= 'A' && ch <= 'Z');
        boolean isLower = (ch >= 'a' && ch <= 'z');

        if (!isUpper && !isLower) {
            System.out.println("Error: Not a letter.");
            return;
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        String input = sc.next();
        vowelorconso(input);
    }
}
