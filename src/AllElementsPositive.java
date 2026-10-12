
/*
 * Problem: Check Whether All Elements Satisfy a Condition
 *
 * Given a list of integers, check whether all numbers are positive.
 *
 * Example 1:
 * Input:  [10, 20, 30, 40]
 * Output: true
 *
 * Example 2:
 * Input:  [10, -5, 30, 40]
 * Output: false
 *
 * Requirement:
 * Use Java 8 Streams to check whether every element is greater than 0.
 *
 * Class Name: AllElementsPositive
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllElementsPositive {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 20, 30, 40);
        boolean  res=ls.stream()
                .allMatch(n-> n>0);

        System.out.println(res);


    }
}
