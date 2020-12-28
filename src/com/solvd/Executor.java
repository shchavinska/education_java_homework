package com.solvd;
import com.solvd.ship.*;


public class Executor {
    public static void main(String[] args){

        Seaport port = new Seaport();

        Submarine submarine = new Submarine("Phobe");
        submarine.setWeight(100500);
        submarine.shoot();
        port.addShipToPort(submarine);

        Cruiser cruiser = new Cruiser("Ross");
        cruiser.setMotorType("Vintovie");
        port.addShipToPort(cruiser);

        FourMasted fourMasted = new FourMasted();
        port.addShipToPort(fourMasted);

        Galley galley = new Galley("Galley");
        port.addShipToPort(galley);

        MotorShip motorShip = new MotorShip("Racel");
        motorShip.setYearOfCreation(2020);
        motorShip.setMotorType("Parovie");
        port.addShipToPort(motorShip);

        Rowboat rowboat = new Rowboat("Chandler");
        rowboat.setYearOfCreation(1994);
        port.addShipToPort(rowboat);

        Canoe canoe = new Canoe("Joe");
        canoe.setPassAmount(2);
        port.addShipToPort(canoe);

        SailingShip sailingShip = new SailingShip("Monica");
        sailingShip.setSailAmount(2);
        port.addShipToPort(sailingShip);

        TwinMasted twinMasted = new TwinMasted();
        port.addShipToPort(twinMasted);

        port.printEveryoneInPort();
        port.swimEveryone();
    }
}
