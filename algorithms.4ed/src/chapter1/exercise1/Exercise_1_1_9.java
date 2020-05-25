package chapter1.exercise1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author Venkateshwara Gowru
 * @Output positive integer to string
 * <p>
 */
public class Exercise_1_1_9 {
    public static void main(String args[]) {
        int N = StdIn.readInt();
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        StdOut.println(s);
    }
}
