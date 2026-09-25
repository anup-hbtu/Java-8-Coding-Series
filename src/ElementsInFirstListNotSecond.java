/*
 * Problem: Find Elements Present in First List but Not in Second
 *
 * Given two lists of integers, find all elements that are present
 * in the first list but are not present in the second list.
 *
 * Example:
 * Input:
 * List 1 = [10, 20, 30, 40, 50]
 * List 2 = [30, 40, 60, 70, 80]
 *
 * Output:
 * [10, 20, 50]
 *
 * Explanation:
 * 10, 20 and 50 are present in List 1 but not in List 2.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ElementsInFirstListNotSecond {
    public static void main(String[] args) {

        List<Integer> l1= Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> l2= Arrays.asList(30, 40, 60, 70, 80);
        HashSet<Integer> hs = new HashSet<>();
        for(int i: l2) {
            hs.add(i);
        }
        List<Integer> res= l1.stream()
                .distinct()
                .filter(i->!hs.contains(i))
                .toList();

        System.out.println(res);
    }
}
