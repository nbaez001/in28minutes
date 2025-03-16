package com.in28minutes.functional;

import java.util.List;

public class Fp01Structured {

    public static void main(String[] args) {
        List<Integer> nummbers = List.of(12, 1, 478, 34, 4, 4, 5, 2);

        printAllNumbersInListStructured(nummbers);
        System.out.println("");
        printAllNumbersInListFunctional(nummbers);
        System.out.println("");
        printOddNumbersInListFunctional(nummbers);
        System.out.println("");
        printSquareOfNumbersInListFunctional(nummbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PFC", "Azure", "Docker", "Kubernetes");
        System.out.println("");
        printAllCoursesInListFunctional(courses);
        System.out.println("");
        printAllCoursesWithAtLeast4InListFunctional(courses);
        System.out.println("");
        printLengthOfCharactersInListFunctional(courses);
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

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printSquareOfNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> Math.pow(number, 2))
                .forEach(System.out::println);
    }

    private static void printAllCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCoursesWithAtLeast4InListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printLengthOfCharactersInListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .map(String::length)
                .forEach(System.out::println);
    }

}
