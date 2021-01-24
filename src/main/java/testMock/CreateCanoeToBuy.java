package testMock;

import port.CanoeToBuy;
import ship.Canoe;

public class CreateCanoeToBuy {

    public static CanoeToBuy createCanoeToBuy (){

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
