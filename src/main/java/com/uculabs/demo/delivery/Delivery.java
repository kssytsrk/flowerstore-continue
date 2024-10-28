package com.uculabs.demo.delivery;

import com.uculabs.demo.Item;

import java.util.List;

public interface Delivery {
    public String deliver(List<Item> items);
}
