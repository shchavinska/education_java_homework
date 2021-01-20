package com.solvd.port;

import com.solvd.ship.Canoe;

import java.util.LinkedList;


public class CanoeToBuy{

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
                return  canoe1;
            }
        }
        return null;
    }

    public void printEveryCanoeToBuy() {
        for (Canoe canoe : listOfCanoeToBuy){
            canoe.printFields();
        }
    }
}