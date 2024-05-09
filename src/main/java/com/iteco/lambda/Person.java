package com.iteco.lambda;

public class Person {
    private String fio;
    private int age;
    private int yearBirth;

    public Person(String fio, int age, int yearBirth) {
        this.fio = fio;
        this.age = age;
        this.yearBirth = yearBirth;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", yearBirth=" + yearBirth +
                '}';
    }
}
