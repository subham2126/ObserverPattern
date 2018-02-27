package com.algorithm;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Offers offers = new Offers();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        offers.addObserver(observer1);

        offers.spreadNews("Hi Guests Welcome to offer zone.");
        offers.addObserver(observer2);
        offers.spreadNews("Hi Guests Welcome to offer zone again.");
        offers.removeObserver(observer1);
        offers.spreadNews("Sorry We are shutting down.");

    }
}
