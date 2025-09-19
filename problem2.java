import java.util.Arrays;
public class problem2 {
    //p2) WAF that accepts a integer array and returns max and min in it
    public static void main(String[] args) {
        int [] arr = {2,3,4,8,1};
        int [] ans = getMaxMin(arr);
        System.out.println("Maximum and Minimum in the array are: [max,min]");
        System.out.println(Arrays.toString(ans));
    }
    public static int[] getMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{max, min};
    }
}