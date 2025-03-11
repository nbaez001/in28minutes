package com.in28minutes.spring.learn.enterprise.example.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> getdata() {
        return Arrays.asList(10, 20, 30, 40);
    }
}