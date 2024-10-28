package com.uculabs.demo.flowerstore;

public class Tulip extends Flower {

    public Tulip() {
        super();
        setFlowerType(FlowerType.TULIP);
    }

    public Tulip(double sepalLength, FlowerColor color, double price) {
        super();
        setFlowerType(FlowerType.TULIP);
        setSepalLength(sepalLength);
        setColor(color);
        setPrice(price);
    }
}