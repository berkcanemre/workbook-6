package com.pluralsight.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a list of 10 people
        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 25),
                new Person("Bob", "Smith", 31),
                new Person("Carol", "Williams", 22),
                new Person("David", "Brown", 40),
                new Person("Eva", "Jones", 29),
                new Person("Frank", "Garcia", 35),
                new Person("Grace", "Martinez", 28),
                new Person("Henry", "Davis", 19),
                new Person("Isabel", "Lopez", 50),
                new Person("Jack", "Wilson", 45)
        );

        // Prompt user for a name to search
        System.out.print("Enter a name to search (first or last): ");
        String search = scanner.nextLine().trim().toLowerCase();

        System.out.println("\n--- Search Results (For Loop) ---");

        // Step 2 (for loop): Find matching people
        List<Person> matchedPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().toLowerCase().contains(search) ||
                    person.getLastName().toLowerCase().contains(search)) {
                matchedPeople.add(person);
            }
        }

        // Display results
        if (matchedPeople.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person p : matchedPeople) {
                System.out.println(p);
            }
        }

        // Step 2 (Stream): Search using streams
        System.out.println("\n--- Search Results (Stream) ---");
        List<Person> streamMatches = people.stream()
                .filter(p -> p.getFirstName().toLowerCase().contains(search)
                        || p.getLastName().toLowerCase().contains(search))
                .collect(Collectors.toList());

        if (streamMatches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            streamMatches.forEach(System.out::println);
        }

        // Step 3: Age Calculations (For Loop)
        int totalAge = 0;
        int minAge = Integer.MAX_VALUE;
        int maxAge = Integer.MIN_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;
            if (age < minAge) minAge = age;
            if (age > maxAge) maxAge = age;
        }

        double averageAge = (double) totalAge / people.size();

        System.out.println("\n--- Age Stats (For Loop) ---");
        System.out.println("Average Age: " + averageAge);
        System.out.println("Oldest Age: " + maxAge);
        System.out.println("Youngest Age: " + minAge);

        // Step 3: Age Calculations (Streams)
        System.out.println("\n--- Age Stats (Stream) ---");

        double avgAge = people.stream()
                .mapToInt(Person::getAge) // convert to IntStream
                .average()                // compute average
                .orElse(0);               // fallback if list is empty

        int oldestAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);

        int youngestAge = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);

        System.out.println("Average Age: " + avgAge);
        System.out.println("Oldest Age: " + oldestAge);
        System.out.println("Youngest Age: " + youngestAge);
    }
}
