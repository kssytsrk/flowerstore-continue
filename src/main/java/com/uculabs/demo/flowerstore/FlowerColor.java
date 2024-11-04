package com.uculabs.demo.flowerstore;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("red"), BLUE("blue");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }

    @JsonCreator
    public static FlowerColor fromString(String color) {
        return FlowerColor.valueOf(color.toUpperCase());
    }

    @JsonValue
    public String toValue() {
        return this.name();
    }
}