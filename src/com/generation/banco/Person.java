package com.generation.banco;

public class Person {

    private String name;
    private int age;
    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void mostrarPerson() {
        System.out.println( "Name: " + this.getName());
        System.out.println( "Age: "+ this.getAge());
        System.out.println( "Id: " +  this.getId());
    }
}
