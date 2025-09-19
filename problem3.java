public class problem3{
    // p3 WAF to print true if duplicates are present in array else false
    public static void main(String[] args) {
        System.out.println("this is working");
        int [] arr = {2,3,4,8,1,3};
        boolean ans = hasDuplicates(arr);
        System.out.println(ans);
        int [] arr2 = {2,3,4,8,1};
        boolean ans2 = hasDuplicates(arr2);
        System.out.println(ans2);
    }
    public static boolean hasDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true; // Duplicate found
                }
            }
        }
        return false; 
    }
}