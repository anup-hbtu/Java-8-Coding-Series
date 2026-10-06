/*
 * Problem: Handle Duplicate Keys While Converting List<Employee> to Map
 *
 * Given a list of Employee objects, convert the list into a Map where
 * employee ID is the key and Employee object is the value.
 *
 * The list may contain employees with duplicate IDs.
 *
 * If duplicate IDs are found, keep the employee with the higher salary.
 *
 * Example:
 *
 * Input:
 * [
 *   Employee(101, "Anup", 50000),
 *   Employee(102, "Rahul", 60000),
 *   Employee(101, "Anup", 70000),
 *   Employee(103, "Amit", 55000)
 * ]
 *
 * Output:
 * {
 *   101=Employee(101, "Anup", 70000),
 *   102=Employee(102, "Rahul", 60000),
 *   103=Employee(103, "Amit", 55000)
 * }
 *
 * Explanation:
 * Employee ID 101 appears twice:
 *
 * 101 -> 50000
 * 101 -> 70000
 *
 * Since 70000 is higher, keep Employee(101, "Anup", 70000).
 *
 * Requirement:
 * Use Java 8 Streams and Collectors.toMap().
 *
 * Java Version: Java 8
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class HandleDuplicateEmployeeKeys {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee(101, "Anup", 50000),
                new Employee(102, "Rahul", 60000),
                new Employee(101, "Anup", 70000),
                new Employee(103, "Amit", 55000)
        );

        Map<Integer, Employee> result = emp.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Function.identity(),
                        (emp1, emp2) ->
                                emp1.getSalary() >= emp2.getSalary()
                                        ? emp1
                                        : emp2
                ));

        System.out.println(result);
    }
}