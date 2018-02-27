package com.algorithm;

public class Observer2 implements Observer {
    @Override
    public void notifyNews(String news) {
        System.out.println("Observer 2 receives update");
        System.out.println(news);
    }
}
