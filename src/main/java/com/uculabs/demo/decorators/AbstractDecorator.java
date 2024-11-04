package com.uculabs.demo.decorators;

import com.uculabs.demo.Item;

public abstract class AbstractDecorator {
    public Item item;
    public String description;
    public double price;
    public String getDescription(){
        return description;
    };
    public abstract double getPrice();
}