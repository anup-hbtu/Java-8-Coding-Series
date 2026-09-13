/*
# Find First Repeated Character

## Problem Description

Given a string, find the first character that appears more than once.

The character must be returned according to the order in which its
second occurrence is encountered while traversing the string.

If no character is repeated, indicate that no repeated character exists.

## Example

Input: "swiss"

Output: 's'

Explanation:
The character 's' is the first character that appears again in the string.

## Constraints

* The input string may contain uppercase and lowercase letters.
* Character comparison should be case-sensitive unless specified otherwise.
* If no repeated character exists, return an appropriate indication.
*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String s= "swiss";
       Map<Character, Long> mp= s.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

       mp.entrySet().stream().filter(entry-> entry.getValue()>1).findFirst().ifPresent(entry-> System.out.println(entry.getKey()));

    }
}
