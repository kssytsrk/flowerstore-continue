package com.uculabs.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    public String pay(double price) {
        return "Paid by a credit card. Total: " + price + "$";
    }
}
