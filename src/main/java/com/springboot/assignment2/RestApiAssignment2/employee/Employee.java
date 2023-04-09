package com.springboot.assignment2.RestApiAssignment2.employee;

import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UniqueElements;

public class Employee {
    private int id ;
    @Size(min = 2 , max = 20) // -> name should have least 2 characters
    private String name ;
    private int age ;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

