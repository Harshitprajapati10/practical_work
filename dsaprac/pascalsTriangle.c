#include <stdio.h>

void printPascalsTriangle(int n) {
    for (int line = 0; line < n; line++) {
        int C = 1;
        for (int i = 0; i <= line; i++) {
            printf("%d ", C);
            C = C * (line - i) / (i + 1);
        }
        printf("\n");
    }
}

int main() {
    printPascalsTriangle(100);
    return 0;
}

// Q find second largest number from given input of numbers 
// Q find the second larget                                                                                                                                               