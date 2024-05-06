package com.iteco.objandgenrics;

public class Main {
    public static void main(String[] args) {
        ExampleTest exampleTest = new ExampleTest(0, "SomeName");
        ExampleTest2<ExampleTest> exampleTest2 = new ExampleTest2<>(exampleTest);
        System.out.println(exampleTest);
        exampleTest2.field.someMethod();
    }
}
