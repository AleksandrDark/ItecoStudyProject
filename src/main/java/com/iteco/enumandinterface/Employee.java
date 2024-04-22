package com.iteco.enumandinterface;

public class Employee extends Person implements Printable, SeasonHandler{
    private String position;

    public Employee(String name, String surname, int age, String position) {
        super(name, surname, age);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +  super.toString()  + " " +
                "position='" + position + '\'' +
                '}';
    }

    @Override
    public void printSomething() {
        System.out.println("Work!");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
