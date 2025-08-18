package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.Employee;

public class EmployeeUtilities {

    // Print details
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    // Give raise
    public static void giveRaise(Employee emp, double amount) {
        emp.setSalary(emp.getSalary() + amount);
        System.out.println(emp.getName() + " got a raise of " + amount + ". New Salary: " + emp.getSalary());
    }
}