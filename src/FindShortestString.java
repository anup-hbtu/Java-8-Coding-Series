/*
 * Problem: Find the Shortest String in a List
 *
 * Given a list of strings, find the string having the minimum length.
 *
 * If multiple strings have the same minimum length, return the first
 * string that appears in the list.
 *
 * Example 1:
 *
 * Input:
 * ["Java", "Spring", "Microservices", "API"]
 *
 * Output:
 * "API"
 *
 *
 * Example 2:
 *
 * Input:
 * ["Spring", "Java", "Cloud"]
 *
 * Output:
 * "Java"
 *
 * Explanation:
 * Java and Cloud both have length 4.
 * Return the first one: Java.
 *
 *
 * Example 3:
 *
 * Input:
 * ["Programming", "Development", "Engineering"]
 *
 * Output:
 * "Development"
 *
 *
 * Requirement:
 * Use Java 8 Streams.
 *
 * Java Version: Java 8
 */

import java.util.*;
import java.util.stream.Collectors;

public class FindShortestString {

    public static void main(String[] args) {

        List<String> ls = Arrays.asList(
                "Java",
                "Spring",
                "Microservices",
                "API"
        );

        Optional<String> opt=ls.stream().min(Comparator.comparing(s-> s.length()));
      System.out.println(opt.get());
    }
}