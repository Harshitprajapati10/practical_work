package File_IO.File;
import java.io.File;
import java.net.URI;

public class FileExample1 {
    public static void main(String[] args) {
        // way1
        File file = new File("file.txt");
        // way2
        File file2 = new File("C:\\Users\\Harshit\\Documents", "file.txt");
        File dir = new File("C:\\Users\\Harshit\\Documents");
        //way3 
        File file3 = new File(dir, "file.txt");
        // way4
        try {
            URI uri = new URI("file:///C:/Users/Harshit/Documents/file.txt");
            File file4 = new File(uri);
            System.out.println("Path: " + file4.getPath());
            System.out.println("Exists? " + file4.exists());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Path: " + file.getPath());
        System.out.println("Exists? " + file.exists());
    }
}
