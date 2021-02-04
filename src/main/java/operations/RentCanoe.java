package operations;

import port.CanoeToRent;
import ship.Canoe;
import utils.WriteReadProperties;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class RentCanoe {
    private final static Logger LOGGER = Logger.getLogger(RentCanoe.class);

    public static void rentCanoe (CanoeToRent canoeToRent) {
        LOGGER.info("You decided to rent canoe. This is name of canoe what we have: ");
        canoeToRent.printEveryCanoe();
        LOGGER.info("Please choose one and contact the administration of port.");

        WriteReadProperties canoeToRentPort = new WriteReadProperties();

        for (HashMap.Entry<String, Canoe> entry : canoeToRent.getListOfCanoe().entrySet()) {
            String pier = entry.getKey();
            Canoe canoe = entry.getValue();
            canoeToRentPort.setValueToProperties("canoeToRentPort.txt", pier, canoe.getName());
        }
        LOGGER.info(canoeToRentPort.getValueFromProperties("canoeToRentPort.txt", "Pier 1"));
    }
}
