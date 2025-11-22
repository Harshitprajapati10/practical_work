// WAF to sort using bubble sort


#include <stdio.h>
#include <stdbool.h>


// bubble sort(modified)
void bubbleSort(int A[], int n){
    bool swapped;
    for (int i = 0; i < n - 1; i++){
        for (int j = i+1; j < n; j++){
            if (A[i] > A[j]) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
        swapped = false;
    }
    for(int i =0; i < n; i++){
        printf("%d ", A[i]);
    }
    printf("\n");
}


// sort elements in descending order in an array using bubble sort
void bubbleSortDescending(int A[], int n){
    bool swapped;
    for (int i = 0; i < n - 1; i++){
        for (int j = i+1; j < n; j++){
            if (A[i] < A[j]) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
        swapped = false;
    }
    for(int i =0; i < n; i++){
        printf("%d ", A[i]);
    }
    printf("\n");
}



// waf to count no. of swaps and comparisons in bubble sort
void countSwapsAndComparisons(int A[], int n){
    int swapCount = 0;
    int comparisonCount = 0;
    bool swapped;
    for (int i = 0; i < n - 1; i++){
        for (int j = i+1; j < n; j++){
            comparisonCount++;
            if (A[i] > A[j]) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                swapCount++;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
        swapped = false;
    }
    printf("Total comparisons: %d\n", comparisonCount);
    printf("Total swaps: %d\n", swapCount);
}

// waf to implement selectio sort
void selectionSort(int A[], int n){
    for(int i = 0; i < n-1; i++){
        int minIndex = i;
        for(int j = i+1; j < n; j++){
            if(A[j] < A[minIndex]){
                minIndex = j;
            }
        }
        if(minIndex != i){
            int tmp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = tmp;
        }
    }
    for(int i =0; i < n; i++){
        printf("%d ", A[i]);
    }
    printf("\n");
}

// waf to implement insertion sort
void insertionSort(int A[], int n){
    for(int i = 1; i < n; i++){
        int key = A[i];
        int j = i - 1;
        while(j >= 0 && A[j] > key){
            A[j + 1] = A[j];
            j = j - 1;
        }
        A[j + 1] = key;
    }
    for(int i =0; i < n; i++){
        printf("%d ", A[i]);
    }
    printf("\n");
}


// waf to implement quick sort
void quick_sort_helper(int nums[], int start, int end) {
    if (start >= end - 1)
        return;

    int p2 = start - 1;
    int p1 = start;
    int pivot = nums[end - 1];

    while (p1 < end - 1) {
        if (nums[p1] >= pivot) {
            p1++;
        } else {
            int temp = nums[p1];
            nums[p1] = nums[p2 + 1];
            nums[p2 + 1] = temp;
            p1++;
            p2++;
        }
    }
    int temp = nums[p2 + 1];
    nums[p2 + 1] = nums[end - 1];
    nums[end - 1] = temp;
    quick_sort_helper(nums, start, p2 + 1);
    quick_sort_helper(nums, p2 + 2, end);
    printf("Partial: ");
    for (int i = start; i < end; i++) printf("%d ", nums[i]);
    printf("\n");
}

void quick_sort(int nums[], int n) {
    quick_sort_helper(nums, 0, n);
}


int main(){
    int A[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(A)/sizeof(A[0]);
    bubbleSort(A, n);
    bubbleSortDescending(A, n);
    countSwapsAndComparisons(A, n);
    selectionSort(A, n);
    insertionSort(A, n);
    quick_sort(A, n);
    return 0;
}