package testMock;

import port.CanoeToRent;
import ship.Canoe;

public class CreateCanoeToRent {
    public static CanoeToRent createCanoeToRent (){

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
