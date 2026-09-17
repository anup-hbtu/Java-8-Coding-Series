import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Problem Name: Find Strings Starting With a Specific Character
 *
 * Problem Statement:
 * Given a list of strings and a specific character, find all strings
 * that start with the given character.
 * Return a new list containing only the matching strings.
 *
 * Input:
 * List: ["apple", "banana", "avocado", "cherry", "apricot"]
 * Character: 'a'
 *
 * Output:
 * ["apple", "avocado", "apricot"]
 *
 * Example 2:
 * Input:
 * List: ["java", "spring", "javascript", "kotlin"]
 * Character: 'j'
 *
 * Output:
 * ["java", "javascript"]
 *
 * Constraints:
 * - The list may contain any number of strings.
 * - The character comparison is case-sensitive unless specified otherwise.
 */
public class FindStringsStartingWithCharacter {
    public static void main(String[] args) {

        List<String> al= Arrays.asList("java", "spring", "javascript", "kotlin");
       List<String> res=  al.stream()
                .filter(str-> str.startsWith("j"))
                .collect(Collectors.toList());

       System.out.println(res);
    }
}
