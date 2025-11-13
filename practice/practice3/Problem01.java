// WAF to count no. of words in command line argument


public class Problem01{
    public static void main(String[] args) {
        int wordCount = 0;
        for (String arg : args) {
            System.out.println(arg);
            boolean inWord = false;
            for (int i = 0; i < arg.length(); i++) {
                char ch = arg.charAt(i);
                if (ch != ' ') {
                    if (!inWord) {
                        wordCount++; 
                        inWord = true;
                    }
                } else {
                    inWord = false;  
                }
            }
        }
        System.out.println("Total number of words: " + wordCount);
    }
}
