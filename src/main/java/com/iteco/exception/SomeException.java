package com.iteco.exception;

public class SomeException extends Exception{
    String symbol;

    public SomeException(String message, String symbol) {
        super(message);
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}