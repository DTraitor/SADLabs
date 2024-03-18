package com.mcw.states;

public class PreparingState implements IOrderState {
    public IOrderState updateState() {
        System.out.println("Order is prepared");
        return new DeliveredState();
    }

    @Override
    public String toString() {
        return "Preparing State";
    }
}
