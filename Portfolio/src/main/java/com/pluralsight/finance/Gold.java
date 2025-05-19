package com.pluralsight.finance;

// Gold is a type of FixedAsset
public class Gold extends FixedAsset {
    private double weight; // Weight in grams or ounces

    // Constructor
    public Gold(double weight) {
        super("Gold", weight * 60); // Assume 60 per unit weight
        this.weight = weight;
    }

    // Override getValue
    @Override
    public double getValue() {
        return weight * 60; // Value is based on weight
    }
}
