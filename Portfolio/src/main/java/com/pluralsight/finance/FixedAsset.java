package com.pluralsight.finance;

// Abstract class for fixed assets (like gold, house, jewelry)
public abstract class FixedAsset implements Valuable {
    protected String name; // Name of the asset
    protected double marketValue; // Value of the asset

    // Constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    // Get the value of the asset (implemented from Valuable interface)
    public double getValue() {
        return marketValue;
    }
}
