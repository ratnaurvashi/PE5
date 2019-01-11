package com.stackroute.pe5main;

public class Student {
    private int id;
    private String name;
    private int age;

    //constructor for student class
    public Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    //getters and setters for student class
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}