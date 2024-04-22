package com.iteco.enumandinterface;

public interface SeasonHandler {
    default void printSeason(Season season){
        System.out.println("Сейчас время года " + season.name() + ". Цвет сезона " + season.getColor());
    }
}
