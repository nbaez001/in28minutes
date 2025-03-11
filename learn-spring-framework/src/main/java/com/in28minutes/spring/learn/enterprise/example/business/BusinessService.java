package com.in28minutes.spring.learn.enterprise.example.business;

import com.in28minutes.spring.learn.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {

    private DataService dataService;

    @Autowired
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    public long canculateSum() {
        List<Integer> data = dataService.getdata();
        return data.stream().reduce(Integer::sum).get();
    }
}