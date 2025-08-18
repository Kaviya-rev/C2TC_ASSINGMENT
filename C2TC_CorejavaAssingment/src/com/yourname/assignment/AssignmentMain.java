package com.yourname.assignment;

import com.yourname.assignment.employees.*;
import com.yourname.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {

        // Create employees
        Developer dev = new Developer("Alice", 101, 50000, "Java");
        Manager mgr = new Manager("Bob", 102, 70000, 5);

        // Print details
        System.out.println("=== Employee Details ===");
        EmployeeUtilities.printEmployeeDetails(dev);
        EmployeeUtilities.printEmployeeDetails(mgr);

        // Demonstrate work
        System.out.println("\n=== Work ===");
        dev.work();
        mgr.work();

        // Give raises
        System.out.println("\n=== Salary Updates ===");
        EmployeeUtilities.giveRaise(dev, 5000);
        EmployeeUtilities.giveRaise(mgr, 8000);
    }
}