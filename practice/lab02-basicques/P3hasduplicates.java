// WAF that checks if there any duplicates in an array;


public class P3hasduplicates{
    static boolean hasDuplicates(int A[]){
        for(int i = 0; i<A.length;i++){
            for(int j = i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    return true;
                }
            }
        }return false;
    }
    public static void main(String[] args) {
        int A[] = {12,2,34,5,32,1,8};
        System.out.println(hasDuplicates(A));
    }
}