package com.solvd.port;
import com.solvd.ship.Ship;

import java.util.ArrayList;


public class Seaport {
    ArrayList<Ship> port = new ArrayList<>();

    public void addShipToPort(Ship ship){
        port.add(ship);
    }

    public ArrayList<Ship> getShipsInPort(){
        return port;
    }

    public void printEveryoneInPort() {
        for (Ship ship: port) {
            ship.printFields();
        }
    }

    public void swimEveryone() {
        for (Ship ship: port) {
            ship.swim();
        }
    }
}