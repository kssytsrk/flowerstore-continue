package com.uculabs.demo.flowerstore;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.uculabs.demo.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor @Entity @Table
public class Flower extends Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(){
        this.description = "flower";
    }

    public Flower(String color, int sepalLength, double price, FlowerType type){
        this.sepalLength = sepalLength;
        this.price = price;
        this.flowerType = type;
        this.description = type.toString() + " flower";
    }

    public Flower(String color, int sepalLength, double price, String type){
        this.sepalLength = sepalLength;
        this.price = price;
        this.flowerType = FlowerType.valueOf(type.toUpperCase());
        this.description = type.toString() + " flower";
    }

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