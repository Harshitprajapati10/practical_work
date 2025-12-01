// waf that creates and array of 5 integers and asks user for an index to display. Handle ArrayIndexOutOfBoundsException for invalid indeices and InputMismatchException for non integer input using multiple catch blocks.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem03{
    static void printValue(int [] A, int index){
        try {
            int value = A[index];
            System.out.println(value);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ARRAY OUT OF BOUND EXCEPTION!!!!");
        } finally{
            System.out.println("copy that");
        }
    }
    public static void main(String[] args) {
        int [] A = {3,4,32,5,78};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the index for value: ");
            int index = sc.nextInt(); 
            printValue(A, index);
        } catch (InputMismatchException e) {
            System.out.println("WRONG INPUT !!!");
        }
    }
}