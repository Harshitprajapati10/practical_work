// WAF that rotates the given array by k steps

public class P5rotatebyksteps{
     static int[] reverseInt(int A[],int s,int e){
        int temp;
        while(s<e){
            temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }
    static int[] reverseKsteps(int A[], int k){
        A = reverseInt(A, 0, A.length-1);
        A = reverseInt(A, 0, k-1);
        A = reverseInt(A,k,A.length-1);
        return A;
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int k = 3;
        // out = {3,4,5,1,2}
        //5,4,3,2,1
        // 3,4,5 => rev k
        // 1,2 => rev n-k
        A = reverseKsteps(A,k);
        for(int i = 0; i<A.length; i++){
            System.out.print(A[i]+"|");
        }

    }
}