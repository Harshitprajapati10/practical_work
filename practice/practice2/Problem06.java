// WAF that checks a string is palindrome or not

public class Problem06{
    static boolean isPalindrome(String st){
        int s = 0;
        int e = st.length()-1;
        while(s<e){
            if(st.charAt(s) != st.charAt(e)){
                return false;
            }
            s++;e--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("harshhsrah"));
        System.out.println(isPalindrome("abc"));
    }
}