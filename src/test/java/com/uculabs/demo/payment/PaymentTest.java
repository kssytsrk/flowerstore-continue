package com.uculabs.demo.payment;

import com.uculabs.demo.Order;
import com.uculabs.demo.flowerstore.Flower;
import com.uculabs.demo.flowerstore.Rose;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PaymentTest {
    private Payment p;
    private Order order;

    @Test
    void testPayPal() {
        p = new PayPalPaymentStrategy();
        order = new Order();
        order.add(new Flower());
        assertDoesNotThrow(() -> p.pay(order.getPrice()));
    }

    @Test
    void testCredit() {
        p = new CreditCardPaymentStrategy();
        order = new Order();
        order.add(new Rose());
        assertDoesNotThrow(() -> p.pay(order.getPrice()));
    }
}