/*
# Find Second Lowest Number

## Problem Description

Given an array of integers, find the second lowest distinct number.

The second lowest number must be different from the lowest number.

If the array contains fewer than two distinct numbers, indicate that a
second lowest number does not exist.

## Example

Input: [10, 5, 20, 8, 5]

Output: 8

Explanation:
The lowest number is 5.
The second lowest distinct number is 8.

## Constraints

* The array may contain positive, negative, or zero values.
* Duplicate values should be considered only once.
* The solution should identify the second lowest distinct number.
*/


import java.util.Arrays;
import java.util.List;

public class SecondLowestNumber {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10, 5, 20, 8, 5);
        al.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}

