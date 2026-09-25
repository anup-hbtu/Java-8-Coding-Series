/*
 * Problem: Partition Numbers into Even and Odd
 *
 * Test Case 1:
 * Input:
 * List = [10, 15, 20, 25, 30, 35]
 * Output:
 * Even = [10, 20, 30]
 * Odd = [15, 25, 35]
 *
 * Test Case 2:
 * Input:
 * List = [2, 4, 6, 8]
 * Output:
 * Even = [2, 4, 6, 8]
 * Odd = []
 *
 * Test Case 3:
 * Input:
 * List = [1, 3, 5, 7]
 * Output:
 * Even = []
 * Odd = [1, 3, 5, 7]
 *
 * Test Case 4:
 * Input:
 * List = []
 * Output:
 * Even = []
 * Odd = []
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10, 15, 20, 25, 30, 35);
       Map<Boolean, List<Integer>> mp= l.stream()
                .collect(Collectors.partitioningBy(n-> n%2==0));

       System.out.println("Even Numbers are :" + mp.get(true));
       System.out.println("odd Numvers are : " +mp.get(false));
    }
}
