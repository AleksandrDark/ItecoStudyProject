package com.iteco.enumandinterface;

public class Client extends Person implements Printable, SeasonHandler {
    private String order;

    public Client(String name, String surname, int age, String order) {
        super(name, surname, age);
        this.order = order;
    }

    @Override
    public String toString() {
        return "Client{" + super.toString() + " " +
                "order='" + order + '\'' +
                '}';
    }

    @Override
    public void printSomething() {
        System.out.println("Buy!");
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
