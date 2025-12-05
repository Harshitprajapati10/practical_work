
public class Problem01 {

    public static void main(String[] args) {
        System.out.println((char) 65);
        System.out.println((int) 'C');
        System.out.println((int) 'd');
        System.out.println('Y');
        if ('A' < '?') {
            System.out.println('A');
        } else {
            System.out.println('?');
        }

        String str = "Programming";
        for (int i = 0; i < 9; i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        String str1 = "World Wide Web";
        for (int i = 0; i < 10; i++) {
            if (str1.charAt(i) == 'W') {
                System.out.println('M');
            } else {
                System.out.print(str1.charAt(i));
            }
        }

        System.out.println();
        // print string in reverse
        for(int i = str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }


    
}
