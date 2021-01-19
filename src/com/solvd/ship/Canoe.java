package com.solvd.ship;


public class Canoe extends Rowboat {
    private static final int DEFAULT_PADDLE_AMOUNT = 2;

    public Canoe(String name) {
        super(name);
        setPaddleAmount(DEFAULT_PADDLE_AMOUNT);
    }
}