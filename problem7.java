public class problem7{
    public static void main(String[] args) {
        //p7->WAF counts no.of vaiables and consonants in a string
        String str = "hello world";
        System.err.println("this is okay");
        int[] counts = countVowels(str);
        System.out.println("In the string \"" + str + "\":");
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }

    public static int[] countVowels(String str){
        int vowels = 0;
        int consonants = 0;
        String vowelsList = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {//if letter 
                if (vowelsList.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
}