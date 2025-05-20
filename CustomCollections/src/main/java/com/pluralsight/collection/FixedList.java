package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

// Generic class FixedList that can hold elements of any type T
public class FixedList<T> {
    private List<T> items; // List to store the elements
    private int maxSize;   // Maximum number of elements allowed

    // Constructor that sets the maximum size of the list
    public FixedList(int maxSize) {
        this.maxSize = maxSize;           // Assign the maxSize
        this.items = new ArrayList<>();   // Initialize the internal list
    }

    // Method to add an item to the list if it's not full
    public void add(T item) {
        if (items.size() < maxSize) {     // Check if list has room
            items.add(item);              // Add item to list
        } else {
            System.out.println("Cannot add more items. List is full."); // Error message
        }
    }

    // Getter method to retrieve the list of items
    public List<T> getItems() {
        return items;
    }
}
