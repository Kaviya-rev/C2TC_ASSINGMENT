package com.kavya.assignment1;

import com.kavya.assignment1.employees.*;
import com.kavya.assignment1.utilities.*;

public class AssignmentMain {

        public static void main(String[] args) {

                // Manager Instance 

                Manager m = new Manager();
                m.setEmployeeId(101);
                m.setName("Adithiyaa");
                m.setSalary(80000);

                m.setTeams("Team Alpha");
                m.setManagerId(01);
                m.setDept("AIML");


                //Developer Instance

                 Developer d = new Developer();
                d.setEmployeeId(102);         // From Employee class
                d.setName("Selva");
                d.setSalary(60000);

                // Developer-specific fields
                d.setDeveloperId(301);
                d.setProjectId("PRJ-501");
                d.setSecuitykey(9999);

                // Using utilities to print and modify
                EmployeeUtilities.printEmployeeInfo(m);
                EmployeeUtilities.provideBonus(m, 10);

                System.out.println("-------------------------");

                EmployeeUtilities.printEmployeeInfo(d);
                EmployeeUtilities.provideBonus(d, 15);

                // You can also call their own display methods:
                System.out.println("\nManager Full Info:");
                m.displayManagerInfo();

                System.out.println("\nDeveloper Full Info:");
                d.displayManagerInfo();
        }

}