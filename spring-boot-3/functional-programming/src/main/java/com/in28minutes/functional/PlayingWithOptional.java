package com.in28minutes.functional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
        Optional<String> optional = fruits.stream()
                .filter(predicate)
                .findFirst();

        // Creation methods
        Optional<String> fruit = Optional.of("banana");
        Optional<String> empty = Optional.ofNullable(null);
        Optional<String> empty2 = Optional.empty();

        // Checking presence of a value
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());

        //Retrieving the Value
        // get
        Optional<String> optionalValue = Optional.of("Hello, Java!");
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(optionalValue.get()); // Output: Hello, Java!
        System.out.println(emptyOptional.get()); // Output: Exception

        //orElse
        optionalValue = Optional.of("Hello, Java!");
        emptyOptional = Optional.empty();
        System.out.println(optionalValue.orElse("Default Value")); // Output: Hello, Java!
        System.out.println(emptyOptional.orElse("Default Value")); // Output: Default Value

        //orElseGet
        optionalValue = Optional.of("Hello, Java!");
        emptyOptional = Optional.empty();
        System.out.println(optionalValue.orElseGet(() -> "Generated Value")); // Output: Hello, Java!
        System.out.println(emptyOptional.orElseGet(() -> "Generated Value")); // Output: Generated Value

        // orElseThrow
        optionalValue = Optional.of("Hello, Java!");
        emptyOptional = Optional.empty();
        System.out.println(optionalValue.orElseThrow()); // Output: Hello, Java!
        System.out.println(emptyOptional.orElseThrow()); // Throws NoSuchElementException

        optionalValue = Optional.of("Hello, Java!");
        emptyOptional = Optional.empty();
        System.out.println(optionalValue.orElseThrow(() -> new IllegalStateException("Value is missing")));
        // Output: Hello, Java!
        System.out.println(emptyOptional.orElseThrow(() -> new IllegalStateException("Value is missing")));
        // Throws IllegalStateException: Value is missing
    }
}
