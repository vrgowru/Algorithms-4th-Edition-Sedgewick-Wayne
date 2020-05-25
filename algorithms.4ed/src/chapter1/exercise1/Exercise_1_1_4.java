package chapter1.exercise1;

/**
 * What(if anything)is wrong with each of the following statements?
 * a. if (a > b) then c = 0;
 * b. if a > b { c = 0; }
 * c. if (a > b) c = 0;
 * d. if (a > b) c = 0 else b = 0;
 *
 * @author Venkateshwara Gowru
 */


public class Exercise_1_1_4 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 100;
//        if (a > b) then c = 0;
//        if a > b {
//            c = 0;
//        }
        if (a > b) c = 0;
//        if (a > b) c = 0
//        else b = 0;
    }
}
