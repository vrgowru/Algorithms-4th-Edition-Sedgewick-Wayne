package chapter1.exercise1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * @author Venkateshwara Gowru
 * @Output Transpose of 2D array with M rows and N columns
 */

public class Exercise_1_1_13 {
    public static void transposeArray(int M, int N) {
        int[][] a = generateRandomArray(M, N);
        int[][] aT = new int[N][M];
        StdOut.println("Input Array \n");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.printf("%3d", a[i][j]);
            }
            StdOut.println();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                aT[i][j] = a[j][i];
            }
        }
        StdOut.println("Transposed Array \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                StdOut.printf("%3d", aT[i][j]);
            }
            StdOut.println();
        }
    }

    public static int[][] generateRandomArray(int M, int N) {
        int a[][] = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = StdRandom.uniform(0, 25);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int M = StdRandom.uniform(5, 10);
        int N = StdRandom.uniform(5, 10);
        transposeArray(M, N);
    }
}
