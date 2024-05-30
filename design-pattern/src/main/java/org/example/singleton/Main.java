package org.example.singleton;

import org.example.singleton.pattern.Employee;
import org.example.singleton.pattern.Unity;

public class Main {

    public static void main(String[] args) {
        Unity sjc = Unity.getInstance();
        Employee John = new Employee("John", 1L, "blabla@teste.com.br");
        Employee JohnH = new Employee("John", 2L, "blablabla@teste.com.br");

//        sjc.getEmployeeList();
        sjc.addEmployee(John);
        sjc.getEmployeeList().forEach(System.out::println);
        sjc.addEmployee(JohnH);
        sjc.getEmployeeList().forEach(System.out::println);
        sjc.baterPonto(John);
        sjc.baterPonto(John);


    }
}
