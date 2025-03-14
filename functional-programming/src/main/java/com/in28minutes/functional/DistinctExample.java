package com.in28minutes.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 9, 5, 5, 6);

        List<Integer> result = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
