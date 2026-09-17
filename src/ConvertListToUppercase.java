/*
 * Problem Name: Convert List to Uppercase
 *
 * Problem Statement:
 * Given a list of strings, convert every string in the list to uppercase.
 * Return a new list containing the uppercase strings.
 *
 * Input:
 * ["java", "spring", "boot", "kafka"]
 *
 * Output:
 * ["JAVA", "SPRING", "BOOT", "KAFKA"]
 *
 * Example 2:
 * Input: ["hello", "world"]
 * Output: ["HELLO", "WORLD"]
 *
 * Constraints:
 * - The list may contain any number of strings.
 * - Each string contains only alphabetic characters.
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToUppercase {
    public static void main(String[] args) {
        List<String> al= Arrays.asList("hello", "world");
        List<String> res= al.stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
