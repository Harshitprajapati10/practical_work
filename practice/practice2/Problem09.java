// WAF that returns first non repeated chars in string; if there are nn non repeated characters, return a special value(NULL)

public class Problem09{
    static char getFirstNonRepeated(String st){
        for(int i = 0; i<st.length(); i++){
            char c = st.charAt(i);
            int count = 0;
            for(int j = 0; j<st.length();j++){
                if(st.charAt(i) == st.charAt(j)){
                    count ++;
                }
            }
            if(count == 1){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        System.out.println(getFirstNonRepeated("aabbcddee")); // Output: c
        System.out.println(getFirstNonRepeated("aabbcc"));     // Output: (blank char)
        System.out.println(getFirstNonRepeated("swiss"));
    }
}