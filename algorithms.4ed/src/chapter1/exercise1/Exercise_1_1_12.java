package chapter1.exercise1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author Venkateshwara Gowru
 * @Output of a code fragment.
 */
public class Exercise_1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        // Create Array
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        StdOut.println(Arrays.toString(a));
        // Reverse Contents of Array
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        StdOut.println(Arrays.toString(a));
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
}
