package com.demo.service.hystrix;

import com.demo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return  "fegin 断路器 "+name;
    }
}
