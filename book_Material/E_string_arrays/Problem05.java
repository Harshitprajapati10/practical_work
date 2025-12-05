// WAP to print all words in commnad line args

public class Problem05 {

    public static void main(String[] args) {
        /*
        int count = 0;
        for (String arg : args) {
            count ++;
            System.out.println(arg);
        }
        System.out.println(count);
         */

        // count words in string
        String s = "torch nn conv1d is used for nlp";
        int count = 0;
        boolean inWord = false;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' ' && !inWord){
                inWord = true;
                count ++;
            }else if(c == ' '){
                inWord = false;
            }
        }

        System.out.println(count);
    }
}
