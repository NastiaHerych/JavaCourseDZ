package com.company;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File fileEmployee = new File("Employee.obj");
        Employee employee = new Employee(1, "Andrian",2000);
        System.out.println("Our new employee ");
        System.out.println(employee);
        System.out.println();

        System.out.println("After serialization or deserealization:");
        Methods.serialize(employee, fileEmployee);
        System.out.println(Methods.deserealize(fileEmployee));
        System.out.println();

        File EmployeeList = new File("List.obj");
        List<Employee> list = new ArrayList<Employee>();
        list.add(employee);
        list.add(new Employee(2, "Andriy", 2500));
        list.add(new Employee(3, "Nastia", 2800));
        list.add(new Employee(4, "Markyian", 2500));

        System.out.println("List of employee:");
        for (Employee eachEmployee : list) {
            System.out.println(eachEmployee);
        }

        System.out.println();
        System.out.println("List of employee after serialization or deserealization:");
        Methods.serialize((Serializable) list, EmployeeList);

        List<Employee> employeeListDeserialized = new ArrayList<Employee>();
        employeeListDeserialized = (List<Employee>) Methods.deserealize(EmployeeList);
        for (Employee eachEmployee : employeeListDeserialized) {
            System.out.println(eachEmployee);
        }
    }
}
