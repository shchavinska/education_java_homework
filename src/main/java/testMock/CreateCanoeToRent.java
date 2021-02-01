package testMock;

import port.CanoeToRent;
import ship.Canoe;

import org.apache.log4j.Logger;

public class CreateCanoeToRent {
    private final static Logger LOGGER = Logger.getLogger(CreateCanoeToRent.class);

    public static CanoeToRent createCanoeToRent (){
        LOGGER.info("Created canoe to rent");

        CanoeToRent canoeToRent = new CanoeToRent();

        Canoe canoe1 = new Canoe("Lili");
        Canoe canoe2 = new Canoe("Magie");
        Canoe canoe3 = new Canoe("Enid");

        canoeToRent.addCanoe("Pier 1", canoe1);
        canoeToRent.addCanoe("Pier 2", canoe2);
        canoeToRent.addCanoe("Pier 3", canoe3);

        return canoeToRent;
    }
}
