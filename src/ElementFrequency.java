/*

 * Problem: Find Frequency of Each Element in a List
 *
 * Given a list of integers, find the frequency (number of occurrences)
 * of each element present in the list.
 *
 * Input:
 * List<Integer> ls = Arrays.asList(3, 2, 7, 3, 1, 2, 4, 6, 7, 3);
 *
 * Output:
 * {3=3, 2=2, 7=2, 1=1, 4=1, 6=1}
 *
 * Explanation:
 * 3 appears 3 times
 * 2 appears 2 times
 * 7 appears 2 times
 * 1 appears 1 time
 * 4 appears 1 time
 * 6 appears 1 time
 *
 * Expected Approach:
 * Solve the problem using Java 8 Stream API.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElementFrequency {
    public static void main(String[] args) {

         List<Integer> ls = Arrays.asList(3, 2, 7, 3, 1, 2, 4, 6, 7, 3);
        Map<Integer,Long> mp= ls.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mp);
    }

}
