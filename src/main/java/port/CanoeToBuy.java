package port;

import ship.Canoe;

import java.util.LinkedList;

import org.apache.log4j.Logger;

public class CanoeToBuy {
    private final static Logger LOGGER = Logger.getLogger(CanoeToBuy.class);

    LinkedList<Canoe> listOfCanoeToBuy = new LinkedList<>();

    public void addCanoe(Canoe canoe){
        listOfCanoeToBuy.add(canoe);
    }

    public LinkedList<Canoe> getListOfCanoe(){
        return listOfCanoeToBuy;
    }

    public Canoe removeCanoe(String name){
        Canoe canoe1;
        for (Canoe canoe : listOfCanoeToBuy){
            if (name.equals(canoe.getName())){
                canoe1 = canoe;
                listOfCanoeToBuy.remove(canoe);
                LOGGER.info("Canoe was removed");
                return  canoe1;
            }
        }
        LOGGER.warn("Can't remove canoe by name: " + name);
        return null;
    }

    public void printEveryCanoeToBuy() {
        LOGGER.info("Printed every canoe to buy");
        for (Canoe canoe : listOfCanoeToBuy){
            canoe.printFields();
        }
    }
}
