public class problem6{
    public static void main(String[] args) {
        //p6->palindrome string checker
        System.out.println("this is okay");
        String str = "madam";
        boolean result = isPalindrome(str);
        System.out.println("Is the string \"" + str + "\" a palindrome? " +  result);
        System.out.println("this is okay");
        String str2 = "harshit";
        boolean result2 = isPalindrome(str2);
        System.out.println("Is the string \"" + str2 + "\" a palindrome? " +  result2);
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}