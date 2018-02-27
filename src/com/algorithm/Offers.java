package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Offers implements Publisher {

    List<Observer> observers;

    String news;

    Offers(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));

    }

    public void spreadNews(String news){
        this.news = news + "we have " + observers.size() + " members.";

        notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {

        for(int i = 0; i< observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.notifyNews(news);


        }

    }
}
