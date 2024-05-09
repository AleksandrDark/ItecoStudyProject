package com.iteco.lambda;

public class Student {
    private String fio;
    private int age;
    private GROUP group;

    public Student(String fio, int age, GROUP group) {
        this.fio = fio;
        this.age = age;
        this.group = group;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public GROUP getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
