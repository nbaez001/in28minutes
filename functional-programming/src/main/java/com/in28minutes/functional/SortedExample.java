package com.in28minutes.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nerio", "Carlos", "Pedro", "Coco");

        List<String> result = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
