package com.uculabs.demo.flowerstore;

import com.uculabs.demo.Item;
import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor newColor) {
        if (newColor == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.color = newColor;
    }
}