package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a FixedList of Integers with max size of 3
        FixedList<Integer> numbers = new FixedList<>(3);

        numbers.add(10);  // Add 10
        numbers.add(3);   // Add 3
        numbers.add(92);  // Add 92
        numbers.add(43);  // This should fail, list is full

        // Print the number of items actually added
        System.out.println("Number list size: " + numbers.getItems().size()); // Should print 3

        // Create a FixedList of LocalDate with max size of 2
        FixedList<LocalDate> dates = new FixedList<>(2);

        dates.add(LocalDate.now());  // Add current date
        dates.add(LocalDate.now());  // Add another current date
        // dates.add(15);            // This would cause a compile-time error, so it's commented

        // Print the number of items in the date list
        System.out.println("Date list size: " + dates.getItems().size()); // Should print 2
    }
}
