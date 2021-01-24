package operations;

import testMock.CreateCanoeToBuy;
import testMock.CreateCanoeToRent;
import testMock.CreateSeaport;
import exceptions.InputExceptions;
import port.CanoeToBuy;
import port.CanoeToRent;

public class Menu {
    public void show(){
        System.out.println("======Welcome to the Seaport======\n\tPlease tell me how can I help you:");
        System.out.println("Press 1 - for see everyone in port.\nPress 2 - for buy a canoe.\nPress 3 - for rent a canoe.");
        System.out.print("Please make you choice: ");


        try {
            int selection = Input.inputInt();
            switch (selection) {
                case 1:
                    CreateSeaport.createPort();
                    break;
                case 2:
                    CanoeToBuy canoeToBuy = CreateCanoeToBuy.createCanoeToBuy();
                    canoeToBuy.printEveryCanoeToBuy();
                    BuyCanoe.buyCanoe(canoeToBuy);
                    break;
                case 3:
                    CanoeToRent canoeToRent = CreateCanoeToRent.createCanoeToRent();
                    RentCanoe.rentCanoe(canoeToRent);
                    break;
                default:
                    throw new InputExceptions("No such options.");
            }
        }catch (InputExceptions e){
            System.err.println("Input incorrect: " + e.getMessage());
        }
    }
}
