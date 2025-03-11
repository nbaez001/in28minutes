package com.in28minutes.spring.learn.enterprise.example.web;

import com.in28minutes.spring.learn.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    @Autowired
    private BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.canculateSum();
    }
}