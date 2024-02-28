package org.example.observer.entitie;

import java.util.ArrayList;
import java.util.List;

public class Estacao{

    private double pressao;
    private double temperatura;
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(){}


}
