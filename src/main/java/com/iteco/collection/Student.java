package com.iteco.collection;

import java.util.Objects;

public class Student {
    private String fio;
    private int age;
    private String classStudent;
    private Subject subject;

    public Student(String fio, int age, String classStudent, Subject subject) {
        this.fio = fio;
        this.age = age;
        this.classStudent = classStudent;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(fio, student.fio) && Objects.equals(classStudent, student.classStudent) && subject == student.subject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, age, classStudent, subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", classStudent='" + classStudent + '\'' +
                ", subject=" + subject +
                '}';
    }
}
