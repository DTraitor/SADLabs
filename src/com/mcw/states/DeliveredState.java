package com.mcw.states;

public class DeliveredState implements IOrderState {
    public IOrderState updateState() {
        System.out.println("Order is delivered");
        return this;
    }

    @Override
    public String toString() {
        return "Delivered State";
    }
}
