// waf to matrix multipication

public class Problem05 {

    static void matmul(int[][] M1, int[][] M2) {
        int R1 = M1.length;
        int C1 = M1[0].length;
        int R2 = M2.length;
        int C2 = M2[0].length;
        System.out.println("" + R1 + C1 + R2 + C2);

        if (C1 != R2) {
            System.out.println("dimesions not match");
            return;
        }

        int[][] product = new int[R1][C2];
        for (int r = 0; r < R1; r++) {
            for (int c = 0; c < C2; c++) {
                int sum = 0;
                for (int k = 0; k < C1; k++) {
                    sum += M1[r][k] * M2[k][c];
                }
                product[r][c] = sum;
            }
        }
        for (int r = 0; r < R1; r++) {
            for (int c = 0; c < C2; c++) {
                System.out.print(product[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] M1 = {{2,4},{3,1}};
        int [][] M2 = {{1,0},{2,3}};
        // int[][] M1 = {{1}, {2}, {3}};
        // int[][] M2 = {{4, 5, 6}};
        matmul(M1, M2);
    }
}
