
/*
 * Problem: Find the Top 3 Highest-Paid Employees
 *
 * Given a list of employees, find the top 3 highest-paid employees
 * using Java 8 Streams.
 *
 * Requirements:
 * 1. Sort employees by salary in descending order.
 * 2. Select the top 3 employees.
 * 3. Print their names and salaries.
 * 4. Duplicate salaries are allowed.
 *
 * Example Input:
 * Employee(101, "Amit", 50000)
 * Employee(102, "Rahul", 75000)
 * Employee(103, "Priya", 60000)
 * Employee(104, "Neha", 90000)
 * Employee(105, "Vikash", 80000)
 *
 * Expected Output:
 * Neha  - 90000
 * Vikash - 80000
 * Rahul - 75000
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee3 {
    private int id;
    private String name;
    private double salary;

    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class Top3HighestPaidEmployees {

    public static void main(String[] args) {

        List<Employee3> employees = Arrays.asList(
                new Employee3(101, "Amit", 50000),
                new Employee3(102, "Rahul", 75000),
                new Employee3(103, "Priya", 60000),
                new Employee3(104, "Neha", 90000),
                new Employee3(105, "Vikash", 80000)
        );

       List<Employee3> emps= employees.stream()
                .sorted(Comparator.comparingDouble(Employee3::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        for(Employee3 emp: emps) {
            System.out.println(emp.getName() +"- "+ emp.getSalary());
        }


    }
}
