package com.in28minutes.functional;

import java.util.Comparator;
import java.util.List;

public class Fp01Structured {

    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 1, 478, 34, 4, 4, 5, 2));
        System.out.println("");
        printAllNumbersInListFunctional(List.of(12, 1, 478, 34, 4, 4, 5, 2));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

}
