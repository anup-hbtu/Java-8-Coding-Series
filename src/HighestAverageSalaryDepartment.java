/*
 * Problem: Find Department With Highest Average Salary
 *
 * Given a list of Employee objects containing employee name,
 * department, and salary, find the department having the
 * highest average salary.
 *
 * Example:
 *
 * Input:
 *
 * Employee("Anup", "IT", 60000)
 * Employee("Rahul", "IT", 80000)
 * Employee("Amit", "HR", 50000)
 * Employee("Ravi", "HR", 70000)
 * Employee("Sumit", "Finance", 90000)
 * Employee("Raj", "Finance", 70000)
 *
 * Average salaries:
 *
 * IT      -> (60000 + 80000) / 2 = 70000
 * HR      -> (50000 + 70000) / 2 = 60000
 * Finance -> (90000 + 70000) / 2 = 80000
 *
 * Output:
 * Finance
 *
 * Explanation:
 * Finance has the highest average salary of 80000.
 *
 * Requirement:
 * Use Java 8 Streams.
 *
 * Java Version: Java 8
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Emp {

    private Integer id;
    private String empName;
    private String department;
    private double salary;

    public Emp(Integer id, String empName, String department, double salary) {
        this.id = id;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class HighestAverageSalaryDepartment {

    public static void main(String[] args) {

        List<Emp> emp = Arrays.asList(
                new Emp(101, "Anup", "IT", 60000),
                new Emp(102, "Rahul", "IT", 80000),
                new Emp(103, "Amit", "HR", 50000),
                new Emp(104, "Ravi", "HR", 70000),
                new Emp(105, "Sumit", "Finance", 90000),
                new Emp(106, "Raj", "Finance", 70000)
        );

        Map<String, Double> avgSalary = emp.stream()
               .collect(Collectors.groupingBy(Emp:: getDepartment, Collectors.averagingDouble(Emp::getSalary) ));

        Optional<Map.Entry<String, Double>> result = avgSalary.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(result.get().getKey());

    }
}