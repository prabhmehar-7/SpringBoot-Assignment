package com.springboot.assignment2.RestApiAssignment2.versioning;

public class UserV1 {
    private String name ;
    private int age ;

    public UserV1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserV1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
