// WAF that takes an integer arrat and returns new array with elements in reverse order

import java.util.Scanner;
public class P1revArray{
    static int[] reverseInt(int A[]){
        int s = 0;
        int e = A.length-1;
        int temp;
        while(s<e){
            temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }

    public static void main(String[] args) {
        int A[] = new int[5];
        Scanner s = new Scanner(System.in);
        for(int i = 0;i<A.length;i++){
            System.out.println("Enter value at " + i);
            A[i] = s.nextInt();
        }
        for(int i = 0;i<A.length;i++){
            System.out.println("value at " + i +"is" + A[i]);
        }
        A = reverseInt(A);
        for(int i = 0;i<A.length;i++){
            System.out.println("value at " + i +"is" + A[i]);
        }

    }
}