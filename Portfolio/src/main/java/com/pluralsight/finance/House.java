package com.pluralsight.finance;

// House is a FixedAsset
public class House extends FixedAsset {
    private int yearBuilt; // Year house was built
    private int squareFeet; // Size
    private int bedrooms; // Number of bedrooms

    // Constructor
    public House(int yearBuilt, int squareFeet, int bedrooms) {
        super("House", squareFeet * 120); // Assume 120 per square foot
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // Override getValue
    @Override
    public double getValue() {
        return squareFeet * 120; // Simple formula for value
    }
}
