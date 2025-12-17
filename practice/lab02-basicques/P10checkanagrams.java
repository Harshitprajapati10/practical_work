// WAF that checks two strings are anagrams of each other

public class P10checkanagrams{
    static boolean isValidAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0; i<s.length();i++){
            freq[(int)(s.charAt(i)-97)] += 1;
        }
        for(int j = 0; j<t.length();j++){
            freq[(int)(t.charAt(j)-97)] -= 1;
        }
        // freq[i] = 0 then valid else not
        for(int i = 0 ; i<freq.length; i++){
            if(freq[i]!=0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println(isValidAnagram("slient", "listen"));
        System.out.println(isValidAnagram("slient", "listip"));
    }
}