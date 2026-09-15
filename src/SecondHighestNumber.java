/*
# Find Second Highest Number

## Problem Description

Given an array of integers, find the second highest distinct number.

The second highest number must be different from the highest number.

If the array contains fewer than two distinct numbers, indicate that a
second highest number does not exist.

## Example

Input: [10, 5, 20, 8, 20]

Output: 10

Explanation:
The highest number is 20.
The second highest distinct number is 10.

## Constraints

* The array may contain positive, negative, or zero values.
* Duplicate values should be considered only once.
* The solution should identify the second highest distinct number.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> al= Arrays.asList(10, 5, 20, 8, 20);
        al.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(i-> System.out.println(i));
    }
}
