// WAF to find second largest number from a given list of input numbers

public class P1getsecondlargest {

    static int getsecondLargest(int A[]){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0;i<A.length; i++){
            if(A[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = A[i];
            }else if(A[i] > secondLargest){
                secondLargest = A[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        System.out.println("Is this okay");
        int A[] = {4,3,5,3,21,4,5,13,6,7};
        int secondLar = getsecondLargest(A);
        System.out.println(secondLar);
    }
}