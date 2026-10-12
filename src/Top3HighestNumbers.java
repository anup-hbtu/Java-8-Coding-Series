
/*
 * Problem: Find the Top 3 Highest Numbers
 *
 * Given a list of integers, find the 3 highest numbers using Java 8 Streams.
 *
 * Example 1:
 * Input:  [10, 5, 25, 8, 40, 15, 30]
 * Output: [40, 30, 25]
 *
 * Example 2:
 * Input:  [1, 9, 3, 7, 5]
 * Output: [9, 7, 5]
 *
 * Example 3:
 * Input:  [10, 10, 8, 8, 5, 3]
 * Output: [10, 10, 8]
 *
 * Requirement:
 * - Use Java 8 Streams.
 * - Return the top 3 numbers in descending order.
 * - Duplicate numbers are allowed.
 *

 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top3HighestNumbers {

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10, 5, 25, 8, 40, 15, 30);

        ls.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);


    }
}
