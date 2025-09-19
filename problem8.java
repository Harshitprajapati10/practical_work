public class problem8{
    public static void main(String[] args) {
        //p8->WAF to reverse characters in a string
        String str1 = "harshit stark";
        String reversedStr = reverseString(str1);
        System.out.println("Original string: " + str1);
        System.out.println("Reversed string: " + reversedStr);

        // ###-> calculate no.of words in a string
        String str = "hello world this is java";
        int wordCount = countWords(str);
        System.out.println("In the string \"" + str + "\":");
        System.out.println("Number of words: " + wordCount);
    }
    public static int countWords(String str){
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}