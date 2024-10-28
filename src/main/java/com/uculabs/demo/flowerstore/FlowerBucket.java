package com.uculabs.demo.flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class FlowerBucket {
    @Getter
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double getPrice() {
        double totalPrice = 0;
        for (FlowerPack pack : flowerPacks) {
            totalPrice += pack.getPrice();
        }
        return totalPrice;
    }
}