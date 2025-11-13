// WAF that counts the no. of vowels and consonants in a string
import java.util.Arrays;
public class Problem07{
    static int[] getVowelorConso(String st){
        st = st.toLowerCase();  
        int vowels = 0, consonants = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'a' && ch <= 'z') { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getVowelorConso("equation")));
    }
}