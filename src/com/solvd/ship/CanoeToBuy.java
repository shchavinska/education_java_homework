package com.solvd.ship;

import java.util.LinkedList;

public class CanoeToBuy{
    LinkedList<Canoe> listOfCanoeToBuy = new LinkedList<>();

    public void addCanoe(Canoe canoe){
        listOfCanoeToBuy.add(canoe);
    }

    public LinkedList<Canoe> getListOfCanoe(){
        return listOfCanoeToBuy;
    }

    public void removeCanoe(String name){
        for (Canoe canoe : listOfCanoeToBuy){
            if (name.equals(canoe.getName())){
                listOfCanoeToBuy.remove(canoe);
            }
        }
    }

    public void printEveryCanoeToBuy() {
        for (Canoe canoe : listOfCanoeToBuy){
            canoe.printFields();
        }
    }
}
