public class getASCII {
    
    public static void main(String[] args) {
        System.out.println("ASCII value of 'a': " + (int) 'a');
        System.out.println("ASCII value of 'A': " + (int) 'A');
        System.out.println("ASCII value of '/': " + (int) '/');
        System.out.println("ASCII value of ' ': " + (int) ' ');
        System.out.println("ASCII value of backspace: " + (int) '\b');
        System.out.println("ASCII value of enter (newline): " + (int) '\n');
        System.out.println("ASCII value of null: " + (int) '\0');
        System.out.println("ASCII value of tab: " + (int) '\t');
        for (char c = '0'; c <= '9'; c++) {
            System.out.println("ASCII value of '" + c + "': " + (int) c);
        }
        System.out.println((int)'m');
        int a = 58;
        System.out.println((char) a);
    }
}