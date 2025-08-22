package com.kavya.assignment1.utilities;

import com.kavya.assignment1.employees.*;

public class EmployeeUtilities {

        public static void printEmployeeInfo(Employees emp)
        {
                System.out.println("--------Employee Information------");
                emp.DisplayEmployeeInfo();
                System.out.println("----------------------------------");

        }

        public static void provideBonus(Employees emp, double percent)
        {
                System.out.println("Employee Salary before bonus:"); 
                double new_sal = emp.getSalary() + (emp.getSalary() * percent/100);
                emp.setSalary(new_sal);
                System.out.println("Updated salary after"+percent+"% hike: "+ new_sal);

        }
}