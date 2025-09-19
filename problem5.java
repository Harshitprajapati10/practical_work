public class problem5{
    public static void main(String[] args) {
        // p5) WAF that rotates an array to the right by k steps, where k is non-negative.
        // Meaning: Given an array and a number k, move each element k positions to the right.
        // Elements that move past the end wrap around to the start.
        // Example:
        // Input: arr = [1, 2, 3, 4, 5], k = 2
        // Output: [4, 5, 1, 2, 3]

        // [3,4,65,7,8,9,4,7,8,43,87,23,45,67,89], k=3
        // [89,67,45,23,87,43,8,7,4,9,8,7,65,4,3], reverse entire array
        //[45,67,89,3,4,65,7,8,9,4,7,8,43,87,23], reverse first k elements
        //[45,67,89,3,4,65,7,8,9,4,7,8,43,87,23], reverse remaining n-k elements
        System.out.println("rotate array to the right by k steps");
        int [] arr = {3,4,65,7,8,9,4,7,8,43,87,23,45,67,89};
        int k = 3;
        rotateArray(arr, k);
        System.out.println("Array after rotation:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than n
        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining n-k elements
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}