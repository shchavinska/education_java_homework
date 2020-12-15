package com.solvd;
import com.solvd.ship.*;


public class Executor {

    public static void main(String[] args){

        Submarine submarine = new Submarine("Phobe");
        submarine.setWeight(100500);
        submarine.printFields();
        submarine.shoot();
        submarine.swim();

        Cruiser cruiser = new Cruiser("Ross");
        cruiser.setMotorType("Vintovie");
        cruiser.printFields();
        cruiser.swim();

        FourMasted fourMasted = new FourMasted();
        fourMasted.printFields();
        fourMasted.swim();

        Galley galley = new Galley();
        galley.printFields();
        galley.swim();

        MotorShip motorShip = new MotorShip("Racel");
        motorShip.setYearOfCreation(2020);
        motorShip.setMotorType("Parovie");
        motorShip.printFields();
        motorShip.swim();

        Rowboat rowboat = new Rowboat("Chandler");
        rowboat.setYearOfCreation(1994);
        rowboat.printFields();
        rowboat.swim();

        Canoe canoe = new Canoe("Joe");
        canoe.setPassAmount(2);
        canoe.printFields();
        canoe.swim();

        SailingShip sailingShip = new SailingShip("Monica");
        sailingShip.setSailAmount(2);
        sailingShip.printFields();
        sailingShip.swim();

        TwinMasted twinMasted = new TwinMasted();
        twinMasted.printFields();
        twinMasted.swim();
    }
}
