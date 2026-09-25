/*
 * Problem: Find Nth Highest Number
 *
 * Given an array of integers and an integer n, find the Nth highest
 * distinct number in the array.
 *
 * If the array contains fewer than n distinct numbers, return -1.
 *
 * Example 1:
 * Input:
 * arr = [10, 5, 20, 8, 20, 15]
 * n = 3
 *
 * Output:
 * 10
 *
 * Explanation:
 * Distinct numbers in descending order:
 * 20 -> 15 -> 10 -> 8 -> 5
 *
 * The 3rd highest distinct number is 10.
 *
 *
 * Example 2:
 * Input:
 * arr = [10, 20, 30, 20, 40, 30]
 * n = 2
 *
 * Output:
 * 30
 *
 *
 * Example 3:
 * Input:
 * arr = [5, 5, 5, 5]
 * n = 2
 *
 * Output:
 * -1
 *
 * Explanation:
 * There is only one distinct number, so the 2nd highest
 * number does not exist.
 *
 *
 * Constraints:
 * 1 <= arr.length <= 100000
 * -10^9 <= arr[i] <= 10^9
 * 1 <= n <= arr.length
 *

 */

import java.util.*;

public class NthHighestNumber {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(10, 5, 20, 8, 20, 15);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();

        Optional<Integer> res = ls.stream()

                .peek(x -> System.out.println("Original: " + x))

                .distinct()

                .peek(x -> System.out.println("After distinct: " + x))

                .sorted(Comparator.reverseOrder())

                .peek(x -> System.out.println("After sorted: " + x))

                .skip(n - 1)

                .peek(x -> System.out.println("After skip: " + x))

                .findFirst();

        System.out.println("Result Optional: " + res);

        //System.out.println("Final result: " + res.get()); // Here Exception will throw if valuer of 'n' is more than the elements count.

        System.out.println(res.orElse(-1));// handle the result and exception very smoothly
    }
}
