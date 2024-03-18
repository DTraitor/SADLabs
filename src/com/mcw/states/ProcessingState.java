package com.mcw.states;

public class ProcessingState implements IOrderState {
    public IOrderState updateState() {
        System.out.println("Order is being processed");
        return new PreparingState();
    }

    @Override
    public String toString() {
        return "Processing State";
    }
}
