package com.uculabs.demo.delivery;

import java.util.List;
import com.uculabs.demo.Item;

import lombok.Getter;

@Getter
public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        String delivering = "Delivering " + items.size() + " items via post...";
        System.out.println(delivering);
        return delivering;
    }
}
