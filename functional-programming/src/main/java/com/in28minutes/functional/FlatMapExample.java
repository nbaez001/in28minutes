package com.in28minutes.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Python"),
                Arrays.asList("C++", "Go")
        );

        List<String> result = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
