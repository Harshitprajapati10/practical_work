// Waf that accept an array of intgers and returns max and min in it

public class P2maxormin{
    
    static int[] getMaxMin(int A[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > max){
                max = A[i];
            }if(A[i] < min){
                min = A[i];
            }
        }return new int[]{min, max};
    }
    public static void main(String[] args) {
        int A[] = {12,2,34,5,32,1,8};
        int B[] = getMaxMin(A);
        for(int i = 0; i<B.length;i++){
            System.out.println(B[i]);
        }
    }
}