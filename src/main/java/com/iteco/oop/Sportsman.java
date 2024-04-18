package com.iteco.oop;

public abstract class Sportsman {

    private Sex gender;
    protected String country;
    private int age;
    private String name;

    public Sportsman() {
    }

    public Sportsman(Sex gender, String country, int age, String name) {
        this.gender = gender;
        this.country = country;
        this.age = age;
        this.name = name;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "gender=" + gender.gender +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }

    public void print() {
        System.out.println("I'm sportsman");
    }

}
