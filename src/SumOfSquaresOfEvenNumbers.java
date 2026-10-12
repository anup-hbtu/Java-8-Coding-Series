/*
 * Problem: Find the Sum of Squares of Even Numbers
 *
 * Given a list of integers, calculate the sum of the squares of all
 * even numbers in the list.
 *
 * Example 1:
 *
 * Input:
 * [1, 2, 3, 4, 5, 6]
 *
 * Output:
 * 56
 *
 * Explanation:
 * Even numbers: 2, 4, 6
 *
 * Squares:
 * 2² = 4
 * 4² = 16
 * 6² = 36
 *
 * Sum = 4 + 16 + 36 = 56
 *
 *
 * Example 2:
 *
 * Input:
 * [2, 4, 8]
 *
 * Output:
 * 84
 *
 * Explanation:
 * 2² + 4² + 8² = 4 + 16 + 64 = 84
 *
 *
 * Example 3:
 *
 * Input:
 * [1, 3, 5, 7]
 *
 * Output:
 * 0
 *
 * Explanation:
 * There are no even numbers in the list.
 *
 *
 * Requirement:
 * Use Java 8 Streams.
 * Filter even numbers, square them, and calculate their sum.
 *

 */

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNumbers {

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6);

     int res=   ls.stream()
                .filter(n-> n%2==0)
                .mapToInt(n-> n*n)
                .sum();


     System.out.println(res);



    }
}