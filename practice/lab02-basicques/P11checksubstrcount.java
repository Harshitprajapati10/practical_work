// create a method that counts how many times a give substring appers in a string;

public class P11checksubstrcount {

    static int countSubstrings(String s, String t) {
        int n = s.length()-1;
        int i = 0;
        int count = 0;
        while (i < n) {
            int j = i;
            if (s.charAt(i) == t.charAt(0)) {
                for (int k = 0; k < t.length(); k++) {
                    if (s.charAt(j) != t.charAt(k)) {
                        break;
                    }
                    j++;
                }
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("banana", "ana"));
    }
}
