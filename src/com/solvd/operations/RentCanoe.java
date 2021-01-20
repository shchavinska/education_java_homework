package com.solvd.operations;

import com.solvd.port.CanoeToRent;
import com.solvd.ship.Canoe;
import com.solvd.utils.WriteReadProperties;

import java.util.HashMap;

public class RentCanoe {
    public static void rentCanoe (CanoeToRent canoeToRent) {
        System.out.println("You decided to rent canoe. This is name of canoe what we have: ");
        canoeToRent.printEveryCanoeToRent();
        System.out.println("Please choose one and contact the administration of port.");

        WriteReadProperties canoeToRentPort = new WriteReadProperties();

        for (HashMap.Entry<String, Canoe> entry : canoeToRent.getListOfCanoe().entrySet()) {
            String pier = entry.getKey();
            Canoe canoe = entry.getValue();
            canoeToRentPort.setValueToProperties("canoeToRentPort.txt", pier, canoe.getName());
        }
        System.out.println(canoeToRentPort.getValueFromProperties("canoeToRentPort.txt", "Pier 1"));
    }
}
