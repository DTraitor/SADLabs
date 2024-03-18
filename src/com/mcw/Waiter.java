package com.mcw;

public class Waiter {
    private Kitchen kitchen;

    public Waiter(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void TakeOrder(Order order) {
        kitchen.SubmitOrder(order);
    }
}
