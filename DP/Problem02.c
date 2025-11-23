#include <stdio.h>

int knapstack(int W, int wt[], int val[], int n){
    int dp[n+1][W+1];
    for(int i = 0; i<=n; i++)
        for(int w = 0; w<=W; w++)
            if(i==0 || w == 0)
                dp[i][w] = 0;
            else if(wt[i-1] <= w)
                if(val[i - 1] + dp[i - 1][w - wt[i - 1]] > dp[i - 1][w])
                    dp[i][w] = (val[i - 1] + dp[i - 1][w - wt[i - 1]]);
                else
                    dp[i][w] = dp[i - 1][w];
            else
                dp[i][w] = dp[i - 1][w];
    printf("the max value of the knapstack is : %d\n",dp[n][W]);
    return dp[n][W];
}


int main() {
    int val[] = {60, 100, 120};
    int wt[] = {1, 1, 1};
    int W = 2;
    int n = sizeof(val) / sizeof(val[0]);
    knapstack(W, wt, val, n); 
    return 0;
}