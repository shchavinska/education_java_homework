package com.solvd;

import com.solvd.ship.Canoe;
import com.solvd.port.CanoeToBuy;
import com.solvd.port.CanoeToRent;
import com.solvd.exceptions.InputExceptions;
import com.solvd.ship.MotorShip;
import com.solvd.ship.Rowboat;
import com.solvd.ship.SailingShip;
import com.solvd.port.Seaport;
import com.solvd.ship.Submarine;
import com.solvd.utils.ReadingFromFile;
import com.solvd.utils.WriteReadProperties;
import com.solvd.utils.WritingToFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


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
                    throw new InputExceptions("No such options.");
            }
        }catch (InputExceptions e){
            System.err.println("Input incorrect: " + e.getMessage());
        }
    }

    public static int intInput() throws InputExceptions {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        }catch (IOException e){
            throw new InputExceptions(e.getMessage());
        }catch (NumberFormatException e){
            throw new InputExceptions("Can't parse integer.");
        }
    }

    public static String strInput() throws InputExceptions {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new InputExceptions(e.getMessage());
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

    public static void buyCanoe (CanoeToBuy canoeToBuy) throws InputExceptions {
        System.out.print("Do you want to bye canoe: (yes/no) ");
        String answer = strInput();

        if (answer.equals("no")){
            System.out.print("Okay.");
        }
        else if (answer.equals("yes")){
            System.out.print("Which canoe do you want to buy: ");
            String answer2 = strInput();
            Canoe boughtCanoe = canoeToBuy.removeCanoe(answer2);
            if (boughtCanoe!=null) {
                System.out.println("Okay, You just buy canoe " + answer2 + "!!!");
                WritingToFile wasBoughtWrite = new WritingToFile();
                wasBoughtWrite.writeToFile("boughtCanoe.txt", "Canoe " + boughtCanoe.getName() + " was bought.");
                ReadingFromFile wasBoughtRead = new ReadingFromFile();
                System.out.println(wasBoughtRead.readFromFile("boughtCanoe.txt"));
            }
            else {
                throw new InputExceptions("Can't found canoe " + answer2);
            }
        }
        else {
            throw new InputExceptions("Sorry, I don't know what you mean.");
        }
    }

    public static void rentCanoe (CanoeToRent canoeToRent) {
        System.out.println("You decided to rent canoe. This is name of canoe what we have: ");
        canoeToRent.printEveryCanoeToRent();
        System.out.println("Please choose one and contact the administration of port.");

        WriteReadProperties canoeToRentPort = new WriteReadProperties();

        for (HashMap.Entry<String, Canoe> entry : canoeToRent.getListOfCanoe().entrySet()) {
            String pier = entry.getKey();
            Canoe canoe = entry.getValue();
            canoeToRentPort.setValueToProperties("canoeToRentPort.txt", pier, canoe.getName());
        }
        System.out.println(canoeToRentPort.getValueFromProperties("canoeToRentPort.txt", "Pier 1"));
    }
}