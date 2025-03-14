package com.in28minutes.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 5, 65, 9);

        List<Integer> result = numbers.stream()
                .peek(n -> System.out.println("Before filtering: " + n))
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
