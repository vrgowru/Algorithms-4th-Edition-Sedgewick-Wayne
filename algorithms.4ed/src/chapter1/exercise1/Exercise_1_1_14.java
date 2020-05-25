package chapter1.exercise1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author Venkateshwara Gowru
 * @Output logarithm to the base 2
 */

public class Exercise_1_1_14 {

    public static int logToBase2(int N) {
        int logbase = 0;
        int base = 2;
        if (N < 2) return 0;
        if (N == 2) return 1;
        while (N >= base) {
            base = base * 2;
            logbase++;
        }
        return logbase;
    }

    public static void main(String[] args) {
        int N = (int) StdRandom.uniform(2, Math.pow(2, 10));
        StdOut.println("Input: " + N);
        StdOut.println("Log base 2: " + logToBase2(N));
    }
}
