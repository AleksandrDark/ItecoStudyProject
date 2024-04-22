package com.iteco.enumandinterface;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Client", "Clientov", 25, "Car");
        Employee employee = new Employee("Employee", "Empl", 44, "Chief");

        client.print();
        employee.print();

        client.printSomething();
        employee.printSomething();

        client.printSeason(Season.WINTER);
        employee.printSeason(Season.SUMMER);
    }
}
