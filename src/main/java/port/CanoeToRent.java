package port;

import ship.Canoe;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class CanoeToRent {
    private final static Logger LOGGER = Logger.getLogger(CanoeToRent.class);

    HashMap<String, Canoe> listOfCanoe = new HashMap<>();

    public void addCanoe(String pier, Canoe canoe){
        listOfCanoe.put(pier, canoe);
    }

    public HashMap<String, Canoe> getListOfCanoe(){
        return listOfCanoe;
    }

    public void printEveryCanoe() {
        LOGGER.info("Printed every canoe to rent");
        for (HashMap.Entry<String, Canoe> entry : listOfCanoe.entrySet()) {
            String pier = entry.getKey();
            Canoe canoe = entry.getValue();
            LOGGER.info(pier);
            canoe.printFields();
        }
    }
}
