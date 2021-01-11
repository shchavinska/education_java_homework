package com.solvd;

import com.solvd.ship.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Executor {
    public static void main(String[] args) {
        System.out.println("======Welcome to the Seaport======\n\tPlease tell me how can I help you:");
        System.out.println("Press 1 - for see everyone in port.\nPress 2 - for buy a canoe.\nPress 3 - for rent a canoe.");
        System.out.print("Please make you choice: ");
        try {
            int selection = intInput();
            switch (selection) {
                case 1:
                    createPort();
                    break;
                case 2:
                    CanoeToBuy canoeToBuy = createCanoeToBuy();
                    canoeToBuy.printEveryCanoeToBuy();
                    buyCanoe(canoeToBuy);
                    break;
                case 3:
                    CanoeToRent canoeToRent = createCanoeToRent();
                    rentCanoe(canoeToRent);
                    break;
                default:
                    throw new InputExeptions("No such options.");
            }
        }catch (InputExeptions e){
            System.err.println("Input incorrect: " + e.getMessage());
        }
    }

    public static int intInput() throws InputExeptions {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        }catch (IOException e){
            throw new InputExeptions(e.getMessage());
        }catch (NumberFormatException e){
            throw new InputExeptions("Can't parse integer.");
        }
    }

    public static String strInput() throws InputExeptions{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine().toLowerCase();
        } catch (IOException e) {
            throw new InputExeptions(e.getMessage());
        }
    }

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

    public static void createPort () {

        Seaport port = new Seaport();

        Submarine submarine = new Submarine("Phobe");
        submarine.setWeight(100500);
        submarine.shoot();
        port.addShipToPort(submarine);

        Rowboat rowboat = new Rowboat("Chandler");
        rowboat.setYearOfCreation(1994);
        port.addShipToPort(rowboat);

        SailingShip sailingShip = new SailingShip("Monica");
        sailingShip.setSailAmount(2);
        port.addShipToPort(sailingShip);

        MotorShip motorShipRacel = new MotorShip("Racel");
        motorShipRacel.setYearOfCreation(2020);
        motorShipRacel.setMotorType(MotorShip.MOTOR_TYPE_STEAM);
        port.addShipToPort(motorShipRacel);

        MotorShip motorShipChip = new MotorShip("Chip");
        motorShipChip.setYearOfCreation(2020);
        motorShipChip.setMotorType(MotorShip.MOTOR_TYPE_ELECTRIC);
        port.addShipToPort(motorShipChip);

        MotorShip motorShipPaolo = new MotorShip("Paolo");
        motorShipPaolo.setYearOfCreation(2020);
        motorShipPaolo.setMotorType(MotorShip.MOTOR_TYPE_FUEL);
        port.addShipToPort(motorShipPaolo);

        MotorShip motorShipBarry = new MotorShip("Barry");
        motorShipBarry.setYearOfCreation(2020);
        motorShipBarry.setMotorType(MotorShip.MOTOR_TYPE_UNKNOWN);
        port.addShipToPort(motorShipBarry);

        port.printEveryoneInPort();
        port.swimEveryone();
    }

    public static void buyCanoe (CanoeToBuy canoeToBuy) throws InputExeptions {
        System.out.print("Do you want to bye canoe: (yes/no) ");
        String answer = strInput();

        if (answer.equals("no")){
            System.out.print("Okay.");
        }
        else if (answer.equals("yes")){
            System.out.print("Which canoe do you want to buy: ");
            String answer2 = strInput();
            if (canoeToBuy.removeCanoe(answer2)) {
                System.out.print("Okay, You just buy canoe " + answer2 + "!!!");
            }
            else {
                throw new InputExeptions("Can't found canoe " + answer2);
            }
        }
        else {
            throw new InputExeptions("Sorry, I don't know what you mean.");
        }
    }

    public static void rentCanoe (CanoeToRent canoeToRent) {
        System.out.println("You decided to rent canoe. This is name of canoe what we have: ");
        canoeToRent.printEveryCanoeToRent();
        System.out.print("Please choose one and contact the administration of port.");
    }
}
