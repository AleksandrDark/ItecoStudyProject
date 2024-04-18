package com.iteco.oop;

public class Main {
    public static void main(String[] args) {
        Boxer boxer = new Boxer(new Sex("man"),
                "Russia", 32, "Aleksandr", 10, 12, 90);
        Runner runner = new Runner(new Sex("woman"),
                "Russia", 19, "Yna", 20, 80);

        System.out.println(boxer);
        System.out.println(runner);

        boxer.print();
        runner.print();
    }
}
