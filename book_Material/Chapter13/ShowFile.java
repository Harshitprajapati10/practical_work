
import java.io.*;

public class ShowFile {

    public static void main(String[] args) {
        // int i;
        // FileInputStream fin;
        // try {
        //     fin = new FileInputStream("Test.txt");
        // } catch (FileNotFoundException e) {
        //     System.out.println("Cannot Open File");
        //     return;
        // }

        // try {
        //     do {
        //         i = fin.read();
        //         if (i != -1) {
        //             System.out.println((char) i);
        //         }
        //     } while (i != -1);
        // } catch (IOException e) {
        //     System.out.println("Error Reading File");
        // } finally {
        //     try {
        //         fin.close();
        //     } catch (IOException e) {
        //         System.out.println("Error Closing File");
        //     }
        // }
        // without close () , initialize filestream inside try
        int i;
        // The following code uses a try-with-resources statement to open
        // a file and then automatically close it when the try block is left.
        try (FileInputStream fin = new FileInputStream("Test.txt")) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }

        // convert inputstream to bytearray
        int j;
        byte[] B = new byte[1024];
        int index = 0;
        try (FileInputStream fis = new FileInputStream("Test.txt")) {
            while ((j = fis.read()) != -1) {
                B[index++] = (byte) j;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }

        System.out.println("Bytes read = " + index);
        for (int k = 0; k < index; k++) {
            System.out.print(B[k] + " ");
        }
    }
}
