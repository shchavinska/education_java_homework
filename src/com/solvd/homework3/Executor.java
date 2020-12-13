package com.solvd.homework3;
import com.solvd.homework3.ship.*;


public class Executor {

    public static void main(String[] args){


        Submarine submarine = new Submarine("Phobe");
        submarine.setWeight(100500);
        System.out.println("---Submarine---");
        submarine.printFields();
        submarine.shoot();

        Cruiser cruiser = new Cruiser("Ross");
        cruiser.setMotorType("Vintovie");
        System.out.println("---Cruiser---");
        cruiser.printFields();

        FourMasted fourMasted = new FourMasted();
        System.out.println("---FourMasted---");
        fourMasted.printFields();

        Galley galley = new Galley();
        System.out.println("---Galley---");
        galley.printFields();

        MotorShip motorShip = new MotorShip("Racel");
        motorShip.setYearOfCreation(2020);
        motorShip.setMotorType("Parovie");
        System.out.println("---MotorShip---");
        motorShip.printFields();

        Rowboat rowboat = new Rowboat("Chandler");
        rowboat.setYearOfCreation(1994);
        System.out.println("---Rowboat---");
        rowboat.printFields();

        Canoe canoe = new Canoe("Joe");
        canoe.setPassAmount(2);
        System.out.println("---Canoe---");
        canoe.printFields();

        SailingShip sailingShip = new SailingShip("Monica");
        sailingShip.setSailAmount(2);
        System.out.println("---SailingShip---");
        sailingShip.printFields();

        TwinMasted twinMasted = new TwinMasted();
        System.out.println("---TwinMasted---");
        twinMasted.printFields();

    }
}
