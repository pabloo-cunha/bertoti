package org.example.observer.entitie;

import java.util.ArrayList;
import java.util.List;

public class Estacao implements Observer{

    private double pressao;
    private double temperatura;
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this, this);
        }
    }
    @Override
    public void update(Observer pressao, Observer temperatura) {

    }
}
