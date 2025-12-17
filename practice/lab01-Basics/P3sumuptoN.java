// sum of natural no. upto n using recursion

public class P3sumuptoN{

    static int sumUptoN(int n){
        if(n==1){
            return 1;
        }
        return n+sumUptoN(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumUptoN(5));
    }
}