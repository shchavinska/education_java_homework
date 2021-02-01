package testMock;

import port.CanoeToBuy;
import ship.Canoe;

import org.apache.log4j.Logger;

public class CreateCanoeToBuy {
    private final static Logger LOGGER = Logger.getLogger(CreateCanoeToBuy.class);

    public static CanoeToBuy createCanoeToBuy (){
        LOGGER.info("Created canoe to buy");

        CanoeToBuy canoeToBuy = new CanoeToBuy();

        Canoe canoe = new Canoe("Joe");
        canoe.setPassAmount(2);
        canoeToBuy.addCanoe(canoe);

        Canoe canoe2 = new Canoe("Boo");
        canoe2.setPassAmount(3);
        canoeToBuy.addCanoe(canoe2);

        Canoe canoe3 = new Canoe("Jesica");
        canoe3.setPassAmount(4);
        canoeToBuy.addCanoe(canoe3);

        return canoeToBuy;
    }
}
