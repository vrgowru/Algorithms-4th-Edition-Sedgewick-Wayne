package chapter1.exercise1;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @author Venkateshwara Gowru
 * @ProblemStatement histogram() that takes an array a[] of int values and an integer M
 * as arguments and returns an array of length M whose ith entry is the
 * num- ber of times the integer i appeared in the argument array.
 * If the values in a[] are all between 0 and M–1, the sum of the
 * values in the returned array should be equal to a.length.
 */

public class Exercise_1_1_15 {
    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];

        return b;
    }

    public static int[] generateRandomArray(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = StdRandom.uniform(0, N);
        return a;
    }

    public static void main(String[] args) {
        int N = StdRandom.uniform(0, 15);
        int M = StdRandom.uniform(0, 25);
        histogram(generateRandomArray(N), M);
    }
}
