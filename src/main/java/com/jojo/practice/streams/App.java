package com.jojo.practice.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

  // TODO
  // QnA

    // List all distinct project in non-ascending order.

        System.out.println("List all distinct project in non-ascending order.");
        System.out.println(employeeList
                .parallelStream()
                .flatMap(emp -> emp.getProjects().stream().map(Project::getName))
                .distinct()
                .toList());

        System.out.println();
        System.out.println();

        System.out.println("Print full name of any employee whose firstName starts with ‘A’.");
        employeeList
            .parallelStream()
            .filter(emp -> emp.getFirstName().startsWith("A"))
            .forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));


        System.out.println();
        System.out.println();

        System.out.println("List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)");
        System.out.println(employeeList
                .parallelStream()
                .filter(emp -> emp.getId().startsWith("2023"))
                .toList());

        System.out.println();
        System.out.println();

        System.out.println("Sort employees based on firstName, for same firstName sort by salary.");
        System.out.println(employeeList
                .parallelStream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                //.sorted(Comparator.comparingInt(Employee::getSalary))
                .toList());
  }
}