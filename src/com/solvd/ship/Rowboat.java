package com.solvd.ship;

public class Rowboat extends Ship{
    private int passAmount;

    public Rowboat(){
        super();
        passAmount = 0;
    }

    public Rowboat(String name){
        super(name);
        passAmount = 0;
    }

    public void setPassAmount(int passAmount){
        this.passAmount = passAmount;
    }

    public int getPasAmount(){
        return passAmount;
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("passAmount: " + passAmount);
    }

}
