package com.algorithm;

public class Observer1 implements Observer {
    @Override
    public void notifyNews(String news) {
        System.out.println("Observer 1 receives update");
        System.out.println(news);
    }
}
