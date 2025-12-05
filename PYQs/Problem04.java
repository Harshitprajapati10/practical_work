/*
F,T,F,T,F,T,F,T

10101010

binary = 85
hex = 55
 */

class Test{
    int test_a, test_b;
    Test(int a, int b){
        this.test_a = a;
        this.test_b = b;
    }
}

public class Problem04 {

    static void convertToHex(boolean[] vals) {
        int pow = 0;
        int decimal = 0;
        for (boolean val : vals) {
            if (val) {
                decimal += Math.pow(2, pow);
            }
            pow += 1;
        }
        System.out.println("hex value is : " +toHex(decimal));
    }

    static String toHex(int n) {
        if (n == 0) {
            return "0";
        }
        String hex = "";
        int remainder;
        while (n > 0) {
            remainder = n % 16;
            char hexChar;
            if (remainder < 10) {
                hexChar = (char) ('0' + remainder);      // 0-9
            } else {
                hexChar = (char) ('A' + (remainder - 10)); // A-F
            }
            hex = hexChar + hex;
            n = n / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        boolean[] vals = {true, false, true, false, true, false, true, false};
        convertToHex(vals);
        System.out.println(toHex(1000));
        String str = null;
        System.out.println(str + "java");

        // for(int i = 0; 0; i++){
        //     System.out.println("this");
        // }

        // Test test = new Test();

    }
}
