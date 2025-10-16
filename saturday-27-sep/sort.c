// write a c program to sort an array using pointers

#include <stdio.h>

void sort(int *arr){
    int n = 10, i, j, temp;
    for(i=0; i<n-1; i++){
        for(j=i+1; j<n; j++){
            if(*(arr+i) > *(arr+j)){
                temp = *(arr+i);
                *(arr+i) = *(arr+j);
                *(arr+j) = temp;
            }
        }
    }
}

void mergesort(int *arr){
    // merge sort implementation
    mergesorthelper(arr, 0, 9);
}

void mergesorthelper(int *arr, int left, int right){
    if(left < right){
        int mid = (left + right) / 2;
        mergesorthelper(arr, left, mid);
        mergesorthelper(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
}

int main(){
    int arr[10] = {34, 7, 23, 32, 5, 62, 32, 4, 3, 1};
    int i;
    sort(arr);
    printf("Sorted array: \n");
    for(i=0; i<10; i++){
        printf("%d ", *(arr+i));
    }

    mergesort(arr); // call merge sorting                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    printf("\nSorted array using merge sort: \n");
    for(i=0; i<10; i++){
        printf("%d ", *(arr+i));
    }
    return 0;                                                                                                                                                                                                                                                                                                                                        
}



