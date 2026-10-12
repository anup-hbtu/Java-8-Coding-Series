
/*
 * Problem: Check Whether Any Element Satisfies a Condition
 *
 * Given a list of integers, check whether at least one number is even.
 *
 * Example 1:
 * Input:  [1, 3, 5, 8, 9]
 * Output: true
 *
 * Example 2:
 * Input:  [1, 3, 5, 7]
 * Output: false
 *
 * Requirement:
 * Use Java 8 Streams to check whether any element is even.
 *
 * Class Name: AnyEvenNumber
 */

import java.util.Arrays;
import java.util.List;

public class AnyEvenNumber {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 8, 9);

       boolean res= ls.stream()
                .anyMatch(n-> n%2==0);

       System.out.println(res);
    }
}
