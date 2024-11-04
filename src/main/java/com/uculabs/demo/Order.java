package com.uculabs.demo;

import com.uculabs.demo.delivery.Delivery;
import com.uculabs.demo.payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Order {
    private List<Item> items;
    private Delivery deliveryMethod;
    private Payment payment;

    public Order() {
        this.items = new ArrayList<>();
    }

    public Order(List<Item> items, Delivery deliveryMethod, Payment payment) {
        this.items = items;
        this.deliveryMethod = deliveryMethod;
        this.payment = payment;
    }

    public double getPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public String processOrder() {
        return payment.pay(this.getPrice()) + "</br>" + deliveryMethod.deliver(items);
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        for (Item i : items) {
            if (i.equals(item)) {
                items.remove(i);
                break;
            }
        }
    }
}