// WAF to check whether the given character is vowel or constant
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <ctype.h>

bool isVowel(char ch) {
    ch = tolower(ch);
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
}
int main() {
    char ch;
    printf("Enter a character: ");
    scanf(" %c", &ch);

    if (isVowel(ch)) {
        printf("%c is a vowel.\n", ch);
    } else {
        printf("%c is a consonant.\n", ch);
    }

    return 0;
}


// Q) WAF to calculate the frequency of each charaacter in a string
