// Demonstrate casts.

class Conversion {

    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nConversion of int to byte.");
        b = (byte) i; // 257 % 256 = 1
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConversion of double to byte.");
        b = (byte) d; // 223.142 % 256 = 67
        System.out.println("d and b " + d + " " + b);


        // byte c = 50;
        // show error bcoz operands are converted to int automatically
        // c = c * 2; // Error! Cannot assign an int to a byte!
    }
}
