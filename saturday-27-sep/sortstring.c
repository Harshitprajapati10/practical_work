// write a function to reverse a string using pointers
#include <stdio.h>  
#include <string.h>
void reverseString(char *str){
    char *start = str;
    char *end = str + strlen(str) - 1;
    char temp;
    while (end > start){
        temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}

int main() {
    char str[100];
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    str[strcspn(str, "\n")] = 0; // remove newline character
    reverseString(str);
    printf("Reversed string: %s\n", str);
    return 0;
}