/*
 * Problem: Join a List of Strings
 *
 * Test Case 1:
 * Input:
 * List = ["Java", "Spring", "Boot", "Kafka"]
 * Output:
 * "Java-Spring-Boot-Kafka"
 *
 * Test Case 2:
 * Input:
 * List = ["Hello", "World"]
 * Output:
 * "Hello-World"
 *
 * Test Case 3:
 * Input:
 * List = ["Apple"]
 * Output:
 * "Apple"
 *
 * Test Case 4:
 * Input:
 * List = []
 * Output:
 * ""
 *
 * Test Case 5:
 * Input:
 * List = ["Java", "Python", "Go", "C++"]
 * Output:
 * "Java-Python-Go-C++"
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStrings {
    public static void main(String[] args) {

        List<String> l1= Arrays.asList("Java", "Python", "Go", "C++");
      String res=  l1.stream()
                .collect(Collectors.joining("-"));


      System.out.println(res);

    }
}
