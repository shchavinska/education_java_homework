package com.solvd.ship;
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
        for (int i = 0; i < port.size(); i++) {
            Ship ship = port.get(i);
            ship.printFields();
        }
    }

    public void swimEveryone() {
        for (int i = 0; i < port.size(); i++) {
            Ship ship = port.get(i);
            ship.swim();
        }
    }
}
