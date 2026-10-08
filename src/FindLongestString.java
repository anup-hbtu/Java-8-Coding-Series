/*
 * Problem: Find the Longest String in a List
 *
 * Given a list of strings, find the string having the maximum length.
 *
 * If multiple strings have the same maximum length, return the first
 * string that appears in the list.
 *
 * Example 1:
 *
 * Input:
 * ["Java", "Spring", "Microservices", "API"]
 *
 * Output:
 * "Microservices"
 *
 *
 * Example 2:
 *
 * Input:
 * ["Java", "Python", "Spring"]
 *
 * Output:
 * "Python"
 *
 * Explanation:
 * Python and Spring both have length 6.
 * Return the first one: Python.
 *
 *
 * Example 3:
 *
 * Input:
 * ["Java", "API", "SQL"]
 *
 * Output:
 * "Java"
 *
 *
 * Requirement:
 * Use Java 8 Streams.
 *
 * Java Version: Java 8
 */

import java.util.*;
import java.util.stream.Collectors;

public class FindLongestString {

    public static void main(String[] args) {

        List<String> ls = Arrays.asList(
                "Java",
                "Spring",
                "Microservices",
                "API"
        );

        Optional<String> res= ls.stream()
                .max(Comparator.comparing(s1->s1.length()));

        System.out.println(res.get());



    }
}