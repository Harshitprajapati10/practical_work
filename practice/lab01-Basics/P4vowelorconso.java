// check whether given character is vowel or constant

public class P4vowelorconso{

    static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public static void main(String[] args) {
        System.out.println(isVowel('d'));
        System.out.println(isVowel('e'));
    }
}