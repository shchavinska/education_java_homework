package testMock;

import port.*;
import utils.*;
import org.apache.log4j.Logger;

import java.io.*;

public class DataFactory {
    private final static Logger LOGGER = Logger.getLogger(DataFactory.class);

    public static CanoeToBuy createCanoeToBuy () throws IOException {
        LOGGER.info("Creating canoe to buy");

        JsonConverter converter = new JsonConverter();
        CanoeToBuy canoeToBuy = converter.readJsonToCanoeToBuy("json/canoeToBuy.json");
        return canoeToBuy;
    }

    public static CanoeToRent createCanoeToRent () throws IOException {
        LOGGER.info("Creating canoe to rent");

        JsonConverter converter = new JsonConverter();
        CanoeToRent canoeToRent = converter.readJsonToCanoeToRent("json/canoeToRent.json");
        return canoeToRent;
    }

    public static Seaport createPort () throws Exception {
        LOGGER.info("Seaport creating");

        JsonConverter converter = new JsonConverter();
        Seaport ships = converter.readJsonToShip("json/ship.json");
        return ships;
    }
}
