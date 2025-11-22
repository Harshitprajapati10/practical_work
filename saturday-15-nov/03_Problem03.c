// WAF for linear search in c
// WAF for bs in c ,recursive and iterativevxcvm,xl;hcjkxzh

#include <stdio.h>


// Linear search
int LinearSearchHelper(int A[],int n, int value, int curIndex){
    if(curIndex > (n-1)){
        return -1;
    }
    if(A[curIndex] == value){
        return curIndex;
    }
    return LinearSearchHelper(A, n, value, curIndex+1);
}

int linearSearch(int A[],int n, int value){
    return LinearSearchHelper(A, n, value, 0);
}


// bs
int binarySearch(int A[], int n, int value){
    int start = 0; int end = n-1;
    int mid;
    while(start<=end){
        mid = start + (end-start)/2;
        if(A[mid] ==  value){
            return mid;
        }
        if(A[mid] > value){
            end = mid -1;
        }
        if(A[mid] < value){
            start = mid + 1;
        }
    }
    return -1;
}


int binarySearchHelper(int A[], int start, int end, int value){
    if(start > end){
        return -1;
    }
    int mid = start + (end - start) / 2;
    if(A[mid] == value){
        return mid;
    }
    if(A[mid] > value){
        return binarySearchHelper(A, start, mid - 1, value);
    }
    return binarySearchHelper(A, mid + 1, end, value);
}

int binarySearchRecursive(int A[], int n, int value){
    return binarySearchHelper(A, 0, n - 1, value);
}



int main(){
    int A[] = {2,4,3,1,67,4,5,7,8,9,12};
    int index = linearSearch(A,11,1);
    printf("%d ", index);

    int B[] = {2,3,4,5,6,7,11,13,24,45,67};
    printf("%d\n ", binarySearch(B,11,13));
    printf("%d ", binarySearchRecursive(B,11,24));

    return 0;
}


// why selection sort when bubble sort exists
// -> fewer swaps -> predictable perf -> simplicity of logic
