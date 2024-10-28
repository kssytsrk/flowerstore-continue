package com.uculabs.demo.payment;

public class PayPalPaymentStrategy implements Payment {

    public String pay(double price) {
        return "Paid using PayPal. Total: " + price + "$";
    }
}
