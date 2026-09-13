/*
# Find First Non-Repeated Character

## Problem Description

Given a string, find the **first character that appears only once** in the entire string.

The character must be returned according to its original order of appearance in the string.

If every character is repeated, indicate that no non-repeated character exists.

## Example

**Input:** `"swiss"`

        **Output:** `'w'`

        **Explanation:**
The character `'s'` appears multiple times, while `'w'` appears only once. Therefore, `'w'` is the first non-repeated character.

        ## Constraints

* The input string may contain uppercase and lowercase letters.
* Character comparison should be case-sensitive unless specified otherwise.
        * If no unique character exists, return an appropriate indication.
*/


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String s= "swiss";
        Map<Character,Long> mp= s.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

       mp.entrySet().stream().filter(entry-> entry.getValue()==1)
                .findFirst().ifPresent(entry ->System.out.println(entry.getKey()));


    }
}
