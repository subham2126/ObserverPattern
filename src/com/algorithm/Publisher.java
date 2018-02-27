package com.algorithm;

public interface Publisher {

    public void addObserver(Observer observer);
    public  void removeObserver(Observer observer);
    public void notifyAllObservers();
}
