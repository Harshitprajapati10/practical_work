public class problem11{
    public static void main(String[] args) {
        // WAF that counts how many times a given substring appears in string
        String txt = "ABCDCDC";
        String pat = "CDC";
        System.out.println(countfreq(pat, txt));
    }
    static int countfreq(String pat, String txt){
        int M = pat.length();
        int N = txt.length();
        int res = 0;
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            if (j == M) {
                res++;
                //j = 0;
            }
        }
        return res;
    }
}