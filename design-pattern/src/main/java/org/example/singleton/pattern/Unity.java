package org.example.singleton.pattern;

import java.util.*;

public class Unity {

    private List<Employee> employeeList = new ArrayList<>();
    private List<Employee> turnList = new ArrayList<>();
    private static Unity instance;

    public Unity() {
    }

    public Unity(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Unity(List<Employee> employeeList, List<Employee> turnList) {
        this.employeeList = employeeList;
        this.turnList = turnList;
    }

    public static Unity getInstance() {
        if (instance == null) {
            instance = new Unity();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        if (employeeList.isEmpty()) {
            employeeList.add(employee);
        }else {
            for (Employee e : employeeList) {
                if (e.getId().equals(employee.getId())) {
                    throw new RuntimeException("Employee already exists");
                }
            }
            employeeList.add(employee);
            System.out.println("Employee added successfully");
        }
    }

    public List<Employee> getTurnList() {
        return turnList;
    }

    public void removeEmployee(Employee employee) {
        if (!employeeList.contains(employee)) {
            throw new RuntimeException("Employee does not exist");
        }
        employeeList.remove(employee);
    }

    public List<Employee> getEmployeeList() {
        if (employeeList.isEmpty()) {
            throw new RuntimeException("Employee list is empty");
        }

        return employeeList;
    }

    public void baterPonto(Employee employee) {
        if (turnList.isEmpty()) {
            turnList.add(employee);
            System.out.println("Punch in successfully");
        } else {
            Iterator<Employee> iterator = turnList.iterator();
            while (iterator.hasNext()) {
                Employee e = iterator.next();
                if (e.getId().equals(employee.getId())) {
                    iterator.remove();
                    System.out.println("Punch out successfully");
                }
            }
        }
    }
}
