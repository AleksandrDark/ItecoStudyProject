package com.iteco.objandgenrics;

public class ExampleTest2<T extends TestInterface > {
    T field;

    public ExampleTest2(T field) {
        this.field = field;
    }


}
