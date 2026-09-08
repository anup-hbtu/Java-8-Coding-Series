import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Class Name: CharacterFrequency
 *
 * Problem: Find Frequency of Each Character in a String
 *
 * Given a string, find the frequency (number of occurrences) of each
 * character present in the string.
 *
 * Input:
 * String str = "programming";
 *
 * Output:
 * {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
 *
 * Explanation:
 * The input string is "programming".
 *
 * Character frequencies:
 * p appears 1 time
 * r appears 2 times
 * o appears 1 time
 * g appears 2 times
 * a appears 1 time
 * m appears 2 times
 * i appears 1 time
 * n appears 1 time
 *
 * Expected Approach:
 * Solve the problem using Java 8 Stream API.
 */
public class CharacterFrequency {

    public static <HashMap> void main(String[] args) {
        String str = "programming";
      Map<Character, Long> mp=   str.chars()
              .mapToObj(c-> (char)c )
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      System.out.println(mp);
    }
}
