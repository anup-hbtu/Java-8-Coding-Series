/*
 * Problem: Group Employees by Department
 *
 * Test Case 1:
 * Input:
 * Employees = [
 *     (1, "Anup", 50000, "IT"),
 *     (2, "Rahul", 60000, "HR"),
 *     (3, "Amit", 55000, "IT"),
 *     (4, "Priya", 70000, "Finance"),
 *     (5, "Neha", 65000, "HR")
 * ]
 *
 * Output:
 * IT      = [Anup, Amit]
 * HR      = [Rahul, Neha]
 * Finance = [Priya]
 *
 * Test Case 2:
 * Input:
 * Employees = [
 *     (1, "Raj", 45000, "IT"),
 *     (2, "Simran", 55000, "IT"),
 *     (3, "Vikas", 60000, "IT")
 * ]
 *
 * Output:
 * IT = [Raj, Simran, Vikas]
 *
 * Test Case 3:
 * Input:
 * Employees = []
 *
 * Output:
 * {}
 *
 * Test Case 4:
 * Input:
 * Employees = [
 *     (1, "Amit", 50000, "IT"),
 *     (2, "Neha", 60000, "HR"),
 *     (3, "Ravi", 70000, "Finance"),
 *     (4, "Priya", 80000, "Marketing")
 * ]
 *
 * Output:
 * IT        = [Amit]
 * HR        = [Neha]
 * Finance   = [Ravi]
 * Marketing = [Priya]
 */

import java.util.*;
import java.util.stream.Collectors;

class Employees {
    public Integer emp_id;
    public String empname;
    public Integer salary;
    public String department;

    Employees(Integer emp_id, String empname, Integer salary, String department) {
        this.emp_id= emp_id;
        this.empname= empname;
        this.salary= salary;
        this.department= department;

    }
    public String getDepartment() {
        return department;
    }
    public Integer getsalary() {
        return salary;
    }
    public String getEmployeeName() {
        return empname;
    }
    @Override
    public String toString() {
        return emp_id +", "+ empname + ", " + salary + ", " + department;
    }
}

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        Employees[] emp= new Employees[6];
        emp[0]= new Employees(1, "Amit", 90000, "IT");
        emp[1]= new Employees(2, "Neha", 96000, "HR");
        emp[2]= new Employees(3, "Ravi", 70000, "Finance");
        emp[3]= new Employees(4, "Priya", 88000, "Marketing");
        emp[4]= new Employees(5, "Ankit", 98000, "IT");
        emp[5]= new Employees(6, "Nehal", 86000, "HR");
       // Group Employees By Department
     Map<String, List<Employees>> mp=    Arrays.stream(emp)
                .collect(Collectors.groupingBy(Employees::getDepartment));

            System.out.println(mp);

            // Employee with Highest Salary
        Optional<Employees> emp1= Arrays.stream(emp)
                .max(Comparator.comparingInt(Employees::getsalary));

        System.out.println("Employee having highest salary : "+emp1.get());

        // Find lowest salary employee

       Optional<Employees> emp2= Arrays.stream(emp)
               .min(Comparator.comparingInt(Employees::getsalary));

       System.out.println("Employee having lowest salary : "+emp2.get());

       // Find second highest salary

        Optional<Employees> emp3= Arrays.stream(emp)
                .sorted(Comparator.comparingInt(Employees:: getsalary).reversed())
                .skip(1)
                .findFirst();

        System.out.println("Employee with second highest salary : "+ emp3.get());

        // Highest Salary By Department
        Map<String,Optional<Employees>> mp2=Arrays.stream(emp)
                        .collect(Collectors.groupingBy(Employees:: getDepartment ,Collectors.maxBy(Comparator.comparingInt(Employees::getsalary))));


        System.out.println("Highest salary department wise");
        System.out.println(mp2);

        // Average Salary By Department

       Map<String,Double> mp3=  Arrays.stream(emp)
                .collect(Collectors.groupingBy(Employees:: getDepartment, Collectors.averagingInt(Employees:: getsalary)));

       System.out.println("Avaerage salary Department wise :");
               System.out.println(mp3);

               // Sort employees by salary
        System.out.println("Employees sorted with salary :");
        Arrays.stream(emp)
                .sorted(Comparator.comparingInt(Employees::getsalary))
                .forEach(e-> System.out.println( e));

        // Sort employees by name
         System.out.println("Employees Sorted by names: ");
        Arrays.stream(emp)
                .sorted(Comparator.comparing(Employees:: getEmployeeName))
                .forEach(e-> System.out.println(e));

        // Sort employees by salary descending
        System.out.println("Employees Sorted by Salary DESC: ");
        Arrays.stream(emp)
                .sorted(Comparator.comparingInt(Employees:: getsalary).reversed())
                .forEach(e -> System.out.println(e));
    }
}
