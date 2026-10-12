
/*
 * Problem: Check Whether No Element Satisfies a Condition
 *
 * Given a list of integers, check whether there are no negative numbers.
 *
 * Example 1:
 * Input:  [1, 2, 3, 4]
 * Output: true
 *
 * Example 2:
 * Input:  [1, -2, 3, 4]
 * Output: false
 *
 * Requirement:
 * Use Java 8 Streams to check whether no element is negative.
 *
 * Class Name: NoNegativeNumbers
 */

import java.util.Arrays;
import java.util.List;

public class NoNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4);
       boolean res= ls.stream()
                .noneMatch(a->a<0);

       System.out.println(res);
    }
}
