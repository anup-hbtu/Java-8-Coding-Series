/*
 * Problem: Find Duplicate Characters in a String
 *
 * Given a String, find all characters that occur more than once.
 *
 * The result should contain each duplicate character only once.
 *
 * Example 1:
 *
 * Input:
 * "programming"
 *
 * Output:
 * [r, g, m]
 *
 * Explanation:
 *
 * r -> appears 2 times
 * g -> appears 2 times
 * m -> appears 2 times
 *
 *
 * Example 2:
 *
 * Input:
 * "hello"
 *
 * Output:
 * [l]
 *
 *
 * Example 3:
 *
 * Input:
 * "abcdef"
 *
 * Output:
 * []
 *
 *
 * Requirement:
 * Use Java 8 Streams.
 *
 * Java Version: Java 8
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";
        Map<Character, Long> frequency = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

       List<Character> ls=  frequency.entrySet().stream()
                .filter(c-> c.getValue()>1)
               .map(entry-> entry.getKey())
                .collect(Collectors.toList());
        System.out.println(ls);
    }
}