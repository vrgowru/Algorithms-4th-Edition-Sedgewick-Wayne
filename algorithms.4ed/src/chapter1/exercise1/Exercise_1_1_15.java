package chapter1.exercise1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

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
        for (int i = 0; i < M; i++) {
            b[a[i]]++;
        }
        return b;
    }

    public static int[] generateRandomArray(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = StdRandom.uniform(0, N);
        StdOut.println(Arrays.toString(a));
        return a;
    }

    public static void main(String[] args) {
        int N = 100;
        int M = 100;
        int sum = 0;
        int[] b = histogram(generateRandomArray(N), M);
        StdOut.println(Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        StdOut.println(sum);
    }
}
