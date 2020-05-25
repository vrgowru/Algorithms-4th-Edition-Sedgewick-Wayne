package chapter1.exercise1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * program that takes three integer command-line arguments and prints equal if all three are equal,
 * and not equal otherwise
 *
 * @author Venkateshwara Gowru
 */

public class Exercise_1_1_3 {
    public static void main(String args[]) {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        int r = StdIn.readInt();
        if (p == q && q == r) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }
}
