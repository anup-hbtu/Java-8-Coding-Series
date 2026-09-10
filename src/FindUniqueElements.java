/*
 * Problem: Find Unique Elements in a List
 *
 * Given a list of integers, find all the elements that appear exactly
 * once in the list.
 *
 * Input:
 * List<Integer> ls = Arrays.asList(3, 2, 7, 3, 1, 2, 4, 6, 7, 5);
 *
 * Output:
 * [3, 2, 7, 1, 4, 6, 5]
 *
 * Explanation:
 * 3 appears 2 times  → Not unique
 * 2 appears 2 times  → Not unique
 * 7 appears 2 times  → Not unique
 * 1 appears 1 time   → Unique
 * 4 appears 1 time   → Unique
 * 6 appears 1 time   → Unique
 * 5 appears 1 time   → Unique
 *
 * Therefore, the unique elements are [1, 4, 6, 5].
 *
 * Expected Approach:
 * Solve the problem using Java 8 Stream API.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueElements {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(3, 2, 7, 3, 1, 2, 4, 6, 7, 5);
        List<Integer> ul= ls.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ul);
    }
}
