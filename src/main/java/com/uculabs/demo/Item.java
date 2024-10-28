package com.uculabs.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    private String name;
    private double price;
}