package operations;

import port.*;
import testMock.DataFactory;
import exceptions.InputExceptions;

import org.apache.log4j.Logger;

public class Menu {
    private final static Logger LOGGER = Logger.getLogger(Menu.class);

    public void show(){
        LOGGER.info("Program started");

        System.out.println("======Welcome to the Seaport======\n\tPlease tell me how can I help you:");
        System.out.println("Press 1 - for see everyone in port.\nPress 2 - for buy a canoe.\nPress 3 - for rent a canoe.");
        System.out.println("Please make you choice: ");

        try {
            int selection = Input.inputInt();
            switch (selection) {
                case 1:
                    Seaport port = DataFactory.createPort();
                    port.printEveryoneInPort();
                    break;
                case 2:
                    CanoeToBuy canoeToBuy = DataFactory.createCanoeToBuy();
                    canoeToBuy.printEveryCanoe();
                    BuyCanoe.buyCanoe(canoeToBuy);
                    break;
                case 3:
                    CanoeToRent canoeToRent = DataFactory.createCanoeToRent();
                    RentCanoe.rentCanoe(canoeToRent);
                    break;
                default:
                    throw new InputExceptions("No such options.");
            }
        }catch (InputExceptions e){
            LOGGER.error("Input incorrect: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
