
import java.io.*;
import java.util.Arrays;

public class charStreamtoByteArray {

    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("Test.txt")) {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            byte[] data = new byte[1024];
            int n;

            while ((n = is.read(data)) != -1) {
                buffer.write(data, 0, n);
            }

            System.out.println(Arrays.toString(buffer.toByteArray()));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("IO exception found");
        }

        // writes in randomaccess file
        try {
            RandomAccessFile raf = new RandomAccessFile("Test.txt", "rw");
            raf.writeBytes("Hello");
            raf.seek(10);
            raf.writeBytes("World");
            raf.seek(0);
            System.out.println(raf.readLine());
            raf.close();
        } catch (IOException e) {
            System.out.println("");
        }

    }
}
