// WAF that reverses the characters in a given string


public class Problem08{
     static char[] reverseInt(char A[]){
        int s = 0;
        int e = A.length-1;
        char temp;
        while(s<e){
            temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }
    static String reverseString(String st){
        char[] chars = new char[st.length()];
        for (int i = 0; i<st.length(); i++){
            chars[i] = st.charAt(i);
        }
        chars = reverseInt(chars);
        String rev = "";
        for (int i = 0; i<st.length(); i++){
            rev += chars[i];
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("harshitkohli"));
    }
}
