package com.uculabs.demo.flowerstore;

import lombok.Getter;
import lombok.Setter;

@Setter
public class FlowerPack {
    @Getter
    private Flower flower;
    @Getter
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return (double) quantity * flower.getPrice();
    }
}