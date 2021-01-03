package com.solvd;
import com.solvd.ship.Canoe;
import com.solvd.ship.Cruiser;
import com.solvd.ship.FourMasted;
import com.solvd.ship.Galley;
import com.solvd.ship.MotorShip;
import com.solvd.ship.Rowboat;
import com.solvd.ship.SailingShip;
import com.solvd.ship.Seaport;
import com.solvd.ship.Submarine;
import com.solvd.ship.TwinMasted;



public class Executor {
    public static void main(String[] args){

        Seaport port = new Seaport();

        Submarine submarine = new Submarine("Phobe");
        submarine.setWeight(100500);
        submarine.shoot();
        port.addShipToPort(submarine);
//
//        Cruiser cruiser = new Cruiser("Ross");
//        cruiser.setMotorType("Vintovie");
//        port.addShipToPort(cruiser);
//
//        FourMasted fourMasted = new FourMasted();
//        port.addShipToPort(fourMasted);
//
//        Galley galley = new Galley("Galley");
//        port.addShipToPort(galley);

        MotorShip motorShipRacel = new MotorShip("Racel");
        motorShipRacel.setYearOfCreation(2020);
        motorShipRacel.setMotorType(MotorShip.MOTOR_TYPE_STEAM);
        port.addShipToPort(motorShipRacel);

        MotorShip motorShipChip = new MotorShip("Chip");
        motorShipChip.setYearOfCreation(2020);
        motorShipChip.setMotorType(MotorShip.MOTOR_TYPE_ELECTRIC);
        port.addShipToPort(motorShipChip);

        MotorShip motorShipPaolo = new MotorShip("Paolo");
        motorShipPaolo.setYearOfCreation(2020);
        motorShipPaolo.setMotorType(MotorShip.MOTOR_TYPE_FUEL);
        port.addShipToPort(motorShipPaolo);

        MotorShip motorShipBarry = new MotorShip("Barry");
        motorShipBarry.setYearOfCreation(2020);
        motorShipBarry.setMotorType(MotorShip.MOTOR_TYPE_UNKNOWN);
        port.addShipToPort(motorShipBarry);
//
//        Rowboat rowboat = new Rowboat("Chandler");
//        rowboat.setYearOfCreation(1994);
//        port.addShipToPort(rowboat);
//
        Canoe canoe = new Canoe("Joe");
        canoe.setPassAmount(2);
        port.addShipToPort(canoe);
//
//        SailingShip sailingShip = new SailingShip("Monica");
//        sailingShip.setSailAmount(2);
//        port.addShipToPort(sailingShip);
//
//        TwinMasted twinMasted = new TwinMasted();
//        port.addShipToPort(twinMasted);

        port.printEveryoneInPort();
        port.swimEveryone();
    }
}
