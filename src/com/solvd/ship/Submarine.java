package com.solvd.ship;


public class Submarine extends MotorShip implements Shooting{
    @Override
    public void shoot() {
        System.out.println("Submarine: " + getName() + " can shoot!!!");
    }

    public Submarine(){
        super();
        setMotorType(MOTOR_TYPE_FUEL);
    }

    public Submarine(String name){
        super(name);
        setMotorType(MOTOR_TYPE_FUEL);
    }
}