package port;

import ship.Ship;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class Seaport {
    private final static Logger LOGGER = Logger.getLogger(Seaport.class);

    ArrayList<Ship> listOfShips = new ArrayList<>();

    public void addShip(Ship ship){
        listOfShips.add(ship);
    }

    public ArrayList<Ship> getShips(){
        return listOfShips;
    }

    public void printEveryoneInPort() {
        LOGGER.info("Printed everyone in port");
        for (Ship ship: listOfShips) {
            ship.printFields();
        }
    }

    public void swimEveryone() {
        LOGGER.info("Commanded swim to everyone in port");
        for (Ship ship: listOfShips) {
            ship.swim();
        }
    }
}
