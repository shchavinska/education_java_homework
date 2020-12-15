package com.solvd.ship;

public class SailingShip extends Ship{

    private int sailAmount;

    public SailingShip(){
        super();
        sailAmount = 0;
    }

    public SailingShip(String name){
        super(name);
        sailAmount = 0;
    }

    public void setSailAmount(int sailAmount) {
        this.sailAmount = sailAmount;
    }

    public int getSailAmount() {
        return sailAmount;
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("sailAmount: " + sailAmount);
    }
}
