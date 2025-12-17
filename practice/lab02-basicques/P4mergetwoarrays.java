// Merge two sorted arrays

public class P4mergetwoarrays{
    static int[] MergeSortedArrays(int A[], int B[]){
        int n = 0;int m = 0;
        int result[] = new int[A.length + B.length];
        while(n<A.length && m<B.length){
            if(A[n] < B[m]){
                result[m+n] = A[n];
                n++;
            }else{
                result[m+n] = B[m];
                m++;
            }
        }
       // remaining elements in A
        while(n!=A.length){
            result[m+n] = A[n];
            n++;
        }
       // remaining els in B
        while(m!=B.length){
            result[m+n] = B[m];
            m++;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int A[] = {1,4,5,8,9};
        int B[] = {3,6};
        int R[] = MergeSortedArrays(A, B);
        for(int i = 0;i<R.length;i++){
            System.out.print(R[i]+" | ");
        }
    }
}