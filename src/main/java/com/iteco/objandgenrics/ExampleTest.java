package com.iteco.objandgenrics;

import java.util.Objects;

public class ExampleTest implements TestInterface{
    int id;
    String name;

    public ExampleTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void someMethod() {
        System.out.println(getId() + " " + getName() + " " + this.getClass().getSimpleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass())
            return false;
        ExampleTest exampleTest = (ExampleTest) obj;

        return exampleTest.getName().equals(getName()) && exampleTest.getId() == id;
    }

    @Override
    public String toString() {
        return "ExampleTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
