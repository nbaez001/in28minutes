package com.in28minutes.spring.learn;

import com.in28minutes.spring.learn.interf.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();
    }

}
