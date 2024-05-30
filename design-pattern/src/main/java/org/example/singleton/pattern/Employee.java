package org.example.singleton.pattern;

public class Employee extends Job {

    private String name;
    private Long id;
    private String email;

    private Job job;
    private static Employee instance;


    public Employee(String name, Long id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public Employee() {
    }

    public static Employee getInstance() {
        if (instance == null) {
            instance = new Employee();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + name + " - Id: " + id;
    }
}
