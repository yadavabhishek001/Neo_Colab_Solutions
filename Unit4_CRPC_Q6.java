import java.util.*;

class MatrixProcessor {

    static class Matrix {
        int[][] arr;
        int n, m;

        Matrix(int n, int m) {
            this.n = n;
            this.m = m;
            arr = new int[n][m];
        }

        void input(Scanner sc) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
        }

        void printSum() {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += arr[i][j];
                }
                System.out.print(sum + " ");
            }
        }
    }
}

class Unit4_CRPC_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        MatrixProcessor.Matrix mat = new MatrixProcessor.Matrix(n, m);
        mat.input(sc);
        mat.printSum();

        sc.close();
    }
}