/*
 * Problem: Find Duplicate Words in a String
 *
 * Given a String containing multiple words, find all words that
 * occur more than once.
 *
 * Each duplicate word should appear only once in the result.
 *
 * Example 1:
 *
 * Input:
 * "Java is easy and Java is powerful"
 *
 * Output:
 * [Java, is]
 *
 * Explanation:
 *
 * Java -> appears 2 times
 * is   -> appears 2 times
 *
 *
 * Example 2:
 *
 * Input:
 * "Spring Boot Java Spring Java"
 *
 * Output:
 * [Spring, Java]
 *
 *
 * Example 3:
 *
 * Input:
 * "Java is powerful"
 *
 * Output:
 * []
 *
 *
 * Requirement:
 * 1. Use Java 8 Streams.
 * 2. Find the frequency of each word.
 * 3. Return only the words whose frequency is greater than 1.
 *
 * Java Version: Java 8
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWords {

    public static void main(String[] args) {

        String str = "Java is easy and Java is powerful";
     String[] arr= str.split(" ");

            Map<String, Long> mp=  Arrays.stream(arr)
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting() ));

           List<String> ls= mp.entrySet()
                    .stream()
                    .filter(e-> e.getValue()>1)
                    .map(e-> e.getKey())
                    .collect(Collectors.toList());

           System.out.println(ls);


    }
}