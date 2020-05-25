package chapter1.exercise1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Out put of the below code block
 * int f = 0;
 * int g = 1;
 * for (int i = 0; i <= 15; i++)
 * {
 * StdOut.println(f); f = f + g;
 * g = f - g;
 * }
 *
 * @Output Fibonacci Series of length 15
 * @author Venkateshwara Gowru
 */

public class Exercise_1_1_6 {
    public static void main(String args[]) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
