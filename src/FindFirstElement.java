import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Problem: Find the First Element in a List
 *
 * Given a list of integers, find the first element present in the list.
 *
 * Input:
 * List<Integer> ls = Arrays.asList(3, 2, 7, 1, 4, 6);
 *
 * Output:
 * 3
 *
 * Explanation:
 * The first element in the list is 3.
 *
 * Expected Approach:
 * Solve the problem using Java 8 Stream API.
 */
public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 2, 7, 1, 4, 6);
      Optional<Integer> firstElement=  ls.stream().findFirst();
      System.out.println(firstElement.get());
    }
}
