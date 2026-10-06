/*
 * Problem: Flatten List<List<Integer>>
 *
 * Given a nested list of integers, convert it into a single
 * flat list containing all the elements.
 *
 * Example:
 *
 * Input:
 *
 * [
 *   [1, 2, 3],
 *   [4, 5],
 *   [6, 7, 8]
 * ]
 *
 * Output:
 *
 * [1, 2, 3, 4, 5, 6, 7, 8]
 *
 *
 * Example 2:
 *
 * Input:
 *
 * [
 *   [10, 20],
 *   [30, 40, 50],
 *   [60]
 * ]
 *
 * Output:
 *
 * [10, 20, 30, 40, 50, 60]
 *
 *
 * Requirement:
 * Use Java 8 Streams and flatMap().
 *
 * Java Version: Java 8
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenNestedList {

    public static void main(String[] args) {

        List<List<Integer>> al= Arrays.asList(Arrays.asList(10, 20),Arrays.asList(30, 40, 50),Arrays.asList(60));

        List<Integer> ls= al.stream()
                .flatMap(list-> list.stream())
                .collect(Collectors.toList());
         System.out.println(ls);
    }
}