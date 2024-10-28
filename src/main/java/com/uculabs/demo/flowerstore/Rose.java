package com.uculabs.demo.flowerstore;

public class Rose extends Flower {

    public Rose() {
        super();
        setFlowerType(FlowerType.ROSE);
    }

    public Rose(double sepalLength, FlowerColor color, double price) {
        super();
        setFlowerType(FlowerType.ROSE);
        setSepalLength(sepalLength);
        setColor(color);
        setPrice(price);
    }
}