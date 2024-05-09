package com.iteco.stream;

import java.util.Objects;

public class Employee {
    private String name;
    private int dateBirth;
    private int salary;

    public Employee(String name, int dateBirth, int salary) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return dateBirth == employee.dateBirth && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateBirth, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateBirth=" + dateBirth +
                ", salary=" + salary +
                '}';
    }
}
