/*
 * Problem: Find Duplicate Elements in a List
 *
 * Given a list of integers, find all the elements that appear more than
 * once in the list.
 *
 * Input:
 * List<Integer> ls = Arrays.asList(3, 2, 7, 3, 1, 2, 4, 6, 7, 3);
 *
 * Output:
 * [3, 2, 7]
 *
 * Explanation:
 * 3 appears 3 times
 * 2 appears 2 times
 * 7 appears 2 times
 *
 * Therefore, the duplicate elements are [3, 2, 7].
 *
 * Expected Approach:
 * Solve the problem using Java 8 Stream API.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(3, 2, 7, 3, 1, 2, 4, 6, 7, 3);
        Map<Integer, Long> mp= ls.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        mp.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
