// WAF in C langouage to print Fibonacci series upto n using recursion and memoization

#include <stdio.h>
#include <stdlib.h>

int fib(int n, int memo[]) {
    if (n <= 1) {
        return n;
    }
    if (memo[n] != -1) {
        return memo[n];
    }
    memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
    return memo[n];
}

void print_fibonacci_series(int n) {
    int *memo = (int *)malloc((n + 1) * sizeof(int));
    for (int i = 0; i <= n; i++) {
        memo[i] = -1;
    }
    for (int i = 0; i < n; i++) {
        printf("%d ", fib(i, memo));
    }
    free(memo);
}
int main() {
    int n;
    printf("Enter the number of terms in the Fibonacci series: ");
    scanf("%d", &n);
    print_fibonacci_series(n);
    return 0;
}


//gcc dsaprac/fibonacci.c -o dsaprac/fibonacci
//./dsaprac/fibonacci