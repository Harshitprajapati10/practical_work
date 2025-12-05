
import java.io.*;

public class BRReadlines {

    public static void main(String args[]) throws IOException {
        // create a BufferedReader using System.in
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str;
        // System.out.println("Enter lines of text.");
        // System.out.println("Enter 'stop' to quit.");
        // do {
        //     str = br.readLine();
        //     System.out.println(str);
        // } while (!str.equals("stop"));
        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }
        System.out.println("\nHere is your file:");
        // display the lines
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i]);

        }
    }
}
