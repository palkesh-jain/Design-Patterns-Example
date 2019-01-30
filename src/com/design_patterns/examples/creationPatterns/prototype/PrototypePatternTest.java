package com.design_patterns.examples.creationPatterns.prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp = new Employee();
        emp.add("Chandler");
        emp.add("Joey");
        emp.add("Ross");

        //Use the clone method to get the Employee object
        Employee emp1 = (Employee) emp.clone();
        Employee emp2 = (Employee) emp.clone();
        List<String> list1 = emp1.getEmpList();
        list1.add("Monica");
        List<String> list2 = emp2.getEmpList();
        list2.remove("Ross");

        System.out.println("emp List: " + emp.getEmpList());
        System.out.println("emp1 List: " + emp1.getEmpList());
        System.out.println("emp2 List: " + emp2.getEmpList());
    }

}
