// check whether given character is vowel or constant

public class Problem04{

    static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public static void main(String[] args) {
        System.out.println(isVowel('d'));
        System.out.println(isVowel('e'));
    }
}