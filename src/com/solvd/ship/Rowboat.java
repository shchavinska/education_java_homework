package com.solvd.ship;


public class Rowboat extends Ship{

    private int passAmount;
    private int paddleAmount;
    private static final int DEFAULT_PADDLE_AMOUNT = 4;

    public Rowboat(){
        super();
        passAmount = 0;
        paddleAmount = DEFAULT_PADDLE_AMOUNT;
    }

    public Rowboat(String name){
        super(name);
        passAmount = 0;
        paddleAmount = DEFAULT_PADDLE_AMOUNT;
    }

    public void setPassAmount(int passAmount){
        this.passAmount = passAmount;
    }

    public int getPasAmount(){
        return passAmount;
    }

    public void setPaddleAmount(int paddleAmount){
        this.paddleAmount = paddleAmount;
    }

    public int getPaddleAmount(){
        return paddleAmount;
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("passAmount: " + passAmount);
        System.out.println("paddleAmount: " + paddleAmount);
    }
}