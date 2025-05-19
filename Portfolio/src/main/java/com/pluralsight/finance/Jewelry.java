package com.pluralsight.finance;

// Jewelry is a FixedAsset
public class Jewelry extends FixedAsset {
    private double karat; // Quality of the jewelry

    // Constructor
    public Jewelry(String name, double karat) {
        super(name, karat * 100); // Assume value is karat * 100
        this.karat = karat;
    }

    // Override getValue
    @Override
    public double getValue() {
        return karat * 100;
    }
}
