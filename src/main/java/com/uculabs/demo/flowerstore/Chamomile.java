package com.uculabs.demo.flowerstore;

public class Chamomile extends Flower {

    public Chamomile() {
        super();
        setFlowerType(FlowerType.CHAMOMILE);
    }

    public Chamomile(double sepalLength, FlowerColor color, double price) {
        super();
        setFlowerType(FlowerType.CHAMOMILE);
        setSepalLength(sepalLength);
        setColor(color);
        setPrice(price);
    }
}