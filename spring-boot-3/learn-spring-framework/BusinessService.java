package com.in28minutes.spring.learn.enterprise.example.business;
@Component
class BusinessService {

    @Autowired
    private DataService dataService;

    public long canculateSum() {
        List<Integer> data = dataService.getdata();
        return data.stream().reduce(Integer::sum).get();
    }
}

package com.in28minutes.spring.learn.enterprise.example.data;
@Component
class DataService {
    public List<Integer> getdata() {
        return Arrays.asList(10, 20, 30, 40);
    }
}