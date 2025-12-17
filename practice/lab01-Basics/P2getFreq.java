
import java.util.HashMap;

// WAF to count the frequency of each character in a give string
public class P2getFreq{
    static void noInbuiltUsed(String s){
        int freq[] = new int[256];
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch]!=0){
                System.out.println(ch+"->"+freq[ch]);
                freq[ch] = 0;
            }
        }
    }

    static void counfFreq(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)+1);
            }else{
                freq.put(ch,1);
            }
        }

        for(char key: freq.keySet()){
            System.out.println(key + "->" +freq.get(key));
        }
    }
    public static void main(String[] args) {
        String s = "apple";
        counfFreq(s);
        noInbuiltUsed(s);
    }
}