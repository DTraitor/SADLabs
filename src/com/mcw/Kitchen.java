package com.mcw;

public class Kitchen {

    public void SubmitOrder(Order order) {
        System.out.println("Order submitted");
        order.progressState();
    }
}
