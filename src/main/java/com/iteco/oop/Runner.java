package com.iteco.oop;

public class Runner extends Sportsman {
    private int speed;
    private int endurance;

    public Runner() {
    }

    public Runner(Sex gender, String country, int age, String name, int endurance, int speed) {
        super(gender, country, age, name);
        this.endurance = endurance;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Runner{" +
                "speed=" + speed +
                ", endurance=" + endurance +
                '}' + "\n";
    }

    public void print(){
        System.out.println("I'm runner. My name is " + this.getName() + ". I can run");
    }
}
