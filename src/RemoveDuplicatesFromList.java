/*
 * Problem: Remove Duplicates from a List
 *
 * Given a list of integers, remove all duplicate elements and return
 * a list containing only unique elements.
 *
 * The original order of elements should be preserved.
 *
 * Input:
 * List<Integer> ls = Arrays.asList(3, 2, 7, 3, 1, 2, 4, 6, 7);
 *
 * Output:
 * [3, 2, 7, 1, 4, 6]
 *
 * Explanation:
 * The input list contains duplicate values:
 * 3 appears twice
 * 2 appears twice
 * 7 appears twice
 *
 * After removing duplicates while preserving the original order,
 * the result is [3, 2, 7, 1, 4, 6].
 *
 * Expected Approach:
 * Solve the problem using Java 8 Stream API.
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 2, 7, 3, 1, 2, 4, 6, 7);
     List<Integer> res=   ls.stream()
                .distinct()
                .collect(Collectors.toList());

     System.out.println(res);
    }
}
