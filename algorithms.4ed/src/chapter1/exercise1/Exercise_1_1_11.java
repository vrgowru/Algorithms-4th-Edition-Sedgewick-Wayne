package chapter1.exercise1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author Venkateshwara Gowru
 * @Output Code fragment that prints the contents of a two-dimensional boolean array,
 * using * to represent true and a space to represent false. Include row and column numbers.
 */

public class Exercise_1_1_11 {
    public static void printBooleanArray(int M, int N) {
        boolean[][] input = generateRandomBoolArray(M, N);
        for (int i = 0; i < N; i++) {
            StdOut.printf("%3d", i);
        }
        StdOut.println();
        for (int i = 0; i < M; i++) {
            StdOut.print(i);
            for (int j = 0; j < N; j++) {
                if (input[i][j])
                    StdOut.printf("%3s", "*");
                else
                    StdOut.printf("%3s", " ");
            }
            StdOut.println();
        }
    }

    public static boolean[][] generateRandomBoolArray(int M, int N) {
        boolean[][] input = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                input[i][j] = StdRandom.bernoulli();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int M = StdRandom.uniform(16, 24);
        int N = StdRandom.uniform(18, 27);
        printBooleanArray(M, N);
    }
}
