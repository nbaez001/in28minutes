package com.in28minutes.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes.springboot.web")
public class SpringBootWebApplicationH2Application extends SpringBootServletInitializer { // AWS

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplicationH2Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplicationH2Application.class, args);
    }
}