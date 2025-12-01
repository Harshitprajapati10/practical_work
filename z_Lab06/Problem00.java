// write a function in java that calculates 1000 ! store using arrays .

import java.util.Arrays;
public class Problem00{

    public static int[] getFactorial(int n) {
        int[] FactorialArray = new int[5000];
        FactorialArray[0] = 1;
        int resultSize = 1;
        for (int x = 2; x <= n; x++) {
            int carry = 0;
            for (int i = 0; i < resultSize; i++) {
                int prod = FactorialArray[i] * x + carry;
                FactorialArray[i] = prod % 10;
                carry = prod / 10; 
            }
            while (carry != 0) {
                FactorialArray[resultSize] = carry % 10;
                carry /= 10;
                resultSize++;
            }
        }

        int[] trimmedResult = new int[resultSize];
        for (int i = 0; i < resultSize; i++) {
            trimmedResult[i] = FactorialArray[i];
        }

        // reverse the trimmedresult
        int s = 0; int e = trimmedResult.length - 1;
        while (s < e) {
            int temp = trimmedResult[s];
            trimmedResult[s] = trimmedResult[e];
            trimmedResult[e] = temp;
            s++;
            e--;
        }
        return trimmedResult;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFactorial(7)));
    }
}