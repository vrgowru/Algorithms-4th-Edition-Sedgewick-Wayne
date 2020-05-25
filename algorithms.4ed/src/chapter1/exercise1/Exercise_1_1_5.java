package chapter1.exercise1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Code fragment that prints true if the double
 * variables x and y are both strictly between 0 and 1 and false otherwise.
 *
 * @author Venkateshwara Gowru
 */

public class Exercise_1_1_5 {
    public static void main (String args[]) {
        double x  = StdIn.readDouble();
        double y = StdIn.readDouble();
        if((0.0 < x && x < 1.00) && (0.0 < y && y < 1.00)) {
            StdOut.println(true);
        } else {
            StdOut.println(false);
        }
    }
}

