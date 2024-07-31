package org.example;

import java.util.*;

public class CollectionOperations {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(5, 3, 8, 5, 2, 8, 1));

        System.out.println("Original list: " + integerList);

        try {
            Set<Integer> integerSet = new HashSet<>(integerList);
            List<Integer> uniqueList = new ArrayList<>(integerSet);

            System.out.println("List without duplicates: " + uniqueList);

            int sum = 0;
            for (int num : uniqueList) {
                sum += num;
            }

            if (uniqueList.size() == 0) {
                throw new ArithmeticException("Cannot divide by zero, the list is empty.");
            }

            double average = (double) sum / uniqueList.size();

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }
}

