// use recursive method to compute the pascals number
// check given number is prime or not using recursive method

public class Problem01{
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }


    public static int pascal(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return pascal(n - 1, k - 1) + pascal(n - 1, k);
    }

    public static void pascalHelper(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    // waf: whetehr n is prime number or not,
    /*
    every prime number(greater than 6) expressed at 6k +1 or 6k+5
    97= 6*16 +1
    31= 6*5 +1
    13= 6*2 +1
    5= 6*0 +5
    */ 

    public static void main(String[] args) {
        System.out.println(isPrime(29)); 
        System.out.println(isPrime(15));
        pascalHelper(5);

        /*
        pascal(5,2)-> pascal(4,1) + pascal(4,2)
                        -> (pascal(3,0) + pascal(3,1)) + (pascal(3,1) + pascal(3,2))
                        -> (1 + (pascal(2,0) + pascal(2,1))) + ((pascal(2,0) + pascal(2,1)) + (pascal(2,1) + pascal(2,2)))
                        -> (1 + (1 + (pascal(1,0) + pascal(1,1)))) + ((1 + (pascal(1,0) + pascal(1,1))) + ((pascal(1,0) + pascal(1,1)) + 1))
                        -> (1 + (1 + (1 + 1))) + ((1 + (1 + 1)) + ((1 + 1) + 1))
                        -> 10
         */
    }
}
