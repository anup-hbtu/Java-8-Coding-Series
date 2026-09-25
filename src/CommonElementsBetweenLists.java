/*
 * Problem: Find Common Elements Between Two Lists
 *
 * Given two lists of integers, find and print all the common elements
 * present in both lists.
 *
 * Duplicate elements should be included only once in the result.
 *
 * Example 1:
 *
 * Input:
 * List 1 = [10, 20, 30, 40, 50]
 * List 2 = [30, 40, 60, 70, 80]
 *
 * Output:
 * [30, 40]
 *
 *
 * Example 2:
 *
 * Input:
 * List 1 = [10, 20, 20, 30, 40]
 * List 2 = [20, 20, 40, 50]
 *
 * Output:
 * [20, 40]
 *
 *
 * Example 3:
 *
 * Input:
 * List 1 = [10, 20, 30]
 * List 2 = [40, 50, 60]
 *
 * Output:
 * []
 *
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsBetweenLists {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> l2= Arrays.asList(30, 40, 60, 70, 80);
        HashSet<Integer> hs = new HashSet<>();
        for(Integer i: l1) {
            hs.add(i);
        }
        List<Integer> res= l2.stream()
                .distinct()
                .filter(hs::contains)
                .collect(Collectors.toList());

        System.out.println("Common elements is : " + res);
    }
}
