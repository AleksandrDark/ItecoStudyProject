package com.iteco.enumandinterface;

public interface Printable {
    default void print(){
        System.out.println(this);
    };
}
