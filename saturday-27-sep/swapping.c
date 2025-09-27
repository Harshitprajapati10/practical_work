// Online C compiler to run C program online
// wtite a c program to swap two numbers using call by value function
#include <stdio.h>

void swapbyrefrence(int *f, int *s){
    int temp = *f;
    *f = *s;
    *s = temp;
}

void swap(int f, int s){
    f = f+s;
    s = f-s;
    f = f-s;
    printf("The value after swapping in function is f=%d s=%d\n",f,s);
}

int main() {
    // Write C code here
    int f = 12;
    int s = 18;
    printf("The value before swapping is f=%d s=%d\n",f,s);
    swap(f,s);
    printf("The value after swapping is f=%d s=%d\n",f,s);
    printf("The value before swapping is f=%d s=%d\n",f,s);
    swapbyrefrence(&f,&s);
    printf("The value after swapping is f=%d s=%d\n",f,s);
    return 0;
}