package com.solvd.homework3.ship;

public class Submarine extends MotorShip implements Shooting{
    @Override
    public void shoot() {
        System.out.println("Submarine: " + getName() + " can shoot!!!");
    }

    public Submarine(){
        super();
    }

    public Submarine(String name){
        super(name);
    }
}
