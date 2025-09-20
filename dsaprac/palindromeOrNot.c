#include<stdio.h>
#include <stdbool.h>
#include <string.h>

 // Function to check if a number is palindrome using two pointer technique
bool isPalindrome(int x) {
    if (x < 0) return false;
    if (x >= 0 && x < 10) return true;
    char str[12]; 
    sprintf(str, "%d", x);
    int left = 0;
    int right = strlen(str) - 1;
    while (left < right) {
        if (str[left] != str[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true; 

}

int main(){
    int number;
    printf("Enter an integer: ");
    scanf("%d", &number);
    if (isPalindrome(number)) {
        printf("%d is a palindrome.\n", number);
    } else {
        printf("%d is not a palindrome.\n", number);
    }
    return 0;
}