package com.mcw;

import com.mcw.delivery.IDeliveryStrategy;
import com.mcw.observer.IObserveSubject;
import com.mcw.observer.IObserver;
import com.mcw.states.IOrderState;

import java.util.*;

public class Order implements IObserveSubject {
    private List<IObserver> observers = new ArrayList<>();
    private List<Product> ordered = new ArrayList<>();
    private IDeliveryStrategy deliveryStrategy;
    private IOrderState state;

    public Order(Client client, List<Product> product, IDeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
        ordered.addAll(product);
        registerObserver(client);
    }

    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }

    public void progressState() {
        state = state.updateState();
        notifyObservers("Order is " + state);
    }
}
