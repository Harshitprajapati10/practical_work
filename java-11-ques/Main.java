

import java.util.*;

public class Main{
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] userArray = takeArrayInput(size);
        int [] numsRev = numsRev(userArray);
        System.out.println(Arrays.toString(numsRev));
    }

    // p1) WAF takes integer array as input and returns new array with elements in reverse order

    public static int[] takeArrayInput(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static int[] numsRev(int[] nums){
        int s = 0;int e = nums.length-1;int temp;
        while(s<=e){
            temp = nums[s];
            nums[s]= nums[e];
            nums[e] = temp;
            s++;e--;
        }
        return nums;
    }
}


