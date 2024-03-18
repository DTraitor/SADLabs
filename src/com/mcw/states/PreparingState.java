package com.mcw.states;

public class PreparingState implements IOrderState {
    public IOrderState updateState() {
        System.out.println("Order is prepared, delievering");
        return new DeliveredState();
    }
}
