package com.solvd.homework2.ship;

public class MotorShip extends Ship {
    private String motorType;

    public MotorShip(){
        super();
        motorType = "Unknown";
    }

    public MotorShip(String name){
        super(name);
        motorType = "Unknown";
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getMotorType() {
        return motorType;
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("motorType: " + motorType);
    }

}
