package com.iteco.collection;

public class StudentException extends Exception{
    private Student student;

    public StudentException(String message, Student student) {
        super(message);
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
