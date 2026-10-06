/*
 * Problem: Convert List<Employee> to Map<Integer, Employee>
 *
 * Given a list of Employee objects, convert the list into a Map where
 * the employee ID is the key and the Employee object is the value.
 *
 * Example:
 *
 * Input:
 * [
 *   Employee(101, "Anup", 50000),
 *   Employee(102, "Rahul", 60000),
 *   Employee(103, "Amit", 55000)
 * ]
 *
 * Output:
 * {
 *   101=Employee(101, "Anup", 50000),
 *   102=Employee(102, "Rahul", 60000),
 *   103=Employee(103, "Amit", 55000)
 * }
 *
 * Requirement:
 * Use Java 8 Streams and Collectors.toMap().
 *
 * Java Version: Java 8
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee {
    private Integer id;
    private String empName;
    private double salary;

    public Employee(Integer id,String empName, double salary ) {
        this.id= id;
        this.empName= empName;
        this.salary= salary;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class ConvertListToMap {

    public static void main(String[] args) {

      List<Employee> emp= Arrays.asList(new Employee(101, "Anup", 50000), new Employee(102, "Rahul", 60000), new Employee(103, "Amit", 55000));

     Map<Integer, Employee> mp=  emp.stream()
              .collect(Collectors.toMap(Employee::getId, employee-> employee));

     System.out.println(mp);



    }
}