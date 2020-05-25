package chapter1.exercise1;

import edu.princeton.cs.algs4.StdOut;

/**
 * This class provides methods for printing output of
 * mathematical, exponential and boolean operations
 *
 * @author Venkateshwara Gowru
 */

public class Exercise_1_1_1 {
    public static void main(String args[]) {
        /* Output would be 7 */
        StdOut.println((0 + 15) / 2);
        /* Output is 495750.4358290221 */
        StdOut.println((2.0 * Math.exp(-6) * 100000000.1));
        /* Output is true */
        StdOut.println((true && false || true && true));
    }
}
