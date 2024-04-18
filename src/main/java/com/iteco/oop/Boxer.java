package com.iteco.oop;

public class Boxer extends Sportsman {

    private int strength;
    int agility;
    protected int speed;

    public Boxer(Sex gender, String country, int age, String name, int strength, int agility, int speed) {
        super(gender, country, age, name);
        this.strength = strength;
        this.agility = agility;
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Boxer has" +
                " strength= " + strength+
                " agility= " + agility +
                " speed=" + speed + "\n";
    }

    public void print(){
        System.out.println("I'm boxer. My name is " + this.getName() + ". I can fight");
    }

}
