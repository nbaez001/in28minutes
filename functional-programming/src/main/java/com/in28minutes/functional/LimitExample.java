package com.in28minutes.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 6, 4);

        List<Integer> result = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
