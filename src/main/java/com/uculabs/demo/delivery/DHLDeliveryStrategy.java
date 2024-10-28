package com.uculabs.demo.delivery;

import com.uculabs.demo.Item;
import lombok.Getter;

import java.util.List;

@Getter
public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items){
        String delivering = "Delivering " + items.size() + " items via DHL...";
        System.out.println(delivering);
        return delivering;
    }
}
