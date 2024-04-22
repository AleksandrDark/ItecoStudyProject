package com.iteco.enumandinterface;

public enum Season {
    SPRING("Green"),
    SUMMER("Yellow"),
    AUTUMN("Orange"),
    WINTER("White");

    private final String color;

    Season(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
