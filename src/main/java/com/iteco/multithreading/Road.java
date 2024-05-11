package com.iteco.multithreading;

public class Road{
    int person;
    int cars;



    public void startPerson() throws InterruptedException {
        while (true){
            Thread.sleep(2000);

            person++;
            System.out.println(person + " person");
            if (person == 4) {
                System.out.println("Светофор для пешеходов включен");
                person = 0;
            }
        }
    }

    public void startCars() throws InterruptedException {
        while (true){
            Thread.sleep(5000);
            cars++;
            System.out.println(cars + " cars");
            if (cars == 3){
                System.out.println("Светофор для машин включен");
                cars = 0;
            }
        }
    }
}
