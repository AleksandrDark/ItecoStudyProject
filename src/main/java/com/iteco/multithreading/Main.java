package com.iteco.multithreading;

public class Main {
    public static void main(String[] args) {
        // > 4 person
        Road road = new Road();
        Thread cars = new Thread(() -> {
            try {
                road.startCars();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "cars");

        Thread person = new Thread(() -> {
            try {
                road.startPerson();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "person");

        person.start();
        cars.start();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);
    }
}
