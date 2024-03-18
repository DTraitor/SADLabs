package com.mcw;

import com.mcw.observer.IObserver;

public class Client implements IObserver {
    public void update(String message) {
        System.out.println("Client received update: " + message);
    }
}
