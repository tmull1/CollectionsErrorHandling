package org.example;

import java.util.*;

public class CollectionOperations {

    public static void main(String[] args) {
        // Create a list of integers with some duplicates
        List<Integer> integerList = new ArrayList<>(Arrays.asList(5, 3, 8, 5, 2, 8, 1));

        // Print the original list
        System.out.println("Original list: " + integerList);

        try {
            // Convert the list to a set to remove duplicates
            Set<Integer> integerSet = new HashSet<>(integerList);
            // Convert the set back to a list to retain list properties
            List<Integer> uniqueList = new ArrayList<>(integerSet);

            // Print the list without duplicates
            System.out.println("List without duplicates: " + uniqueList);

            // Calculate the sum of the elements in the unique list
            int sum = 0;
            for (int num : uniqueList) {
                sum += num;
            }

            // Check if the list is empty before calculating the average
            if (uniqueList.size() == 0) {
                // Throw an exception if trying to divide by zero
                throw new ArithmeticException("Cannot divide by zero, the list is empty.");
            }

            // Calculate the average of the unique elements
            double average = (double) sum / uniqueList.size();

            // Print the sum and average of the list
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (ArithmeticException | IllegalArgumentException e) {
            // Handle arithmetic exceptions (e.g., division by zero) and illegal arguments
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            // Handle index out of bounds exceptions
            System.out.println("Index out of bounds: " + e.getMessage());
        } finally {
            // This block is always executed, regardless of whether an exception occurred
            System.out.println("Operation completed.");
        }
    }
}

