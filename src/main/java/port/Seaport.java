package port;

import ship.Ship;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class Seaport {
    private final static Logger LOGGER = Logger.getLogger(Seaport.class);

    ArrayList<Ship> port = new ArrayList<>();

    public void addShipToPort(Ship ship){
        port.add(ship);
    }

    public ArrayList<Ship> getShipsInPort(){
        return port;
    }

    public void printEveryoneInPort() {
        LOGGER.info("Printed everyone in port");
        for (Ship ship: port) {
            ship.printFields();
        }
    }

    public void swimEveryone() {
        LOGGER.info("Commanded swim to everyone in port");
        for (Ship ship: port) {
            ship.swim();
        }
    }
}
