package com.demo.service;

import com.demo.service.hystrix.SchedualServiceHiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * SchedualServiceHi
 *
 * @author Zhang ShanMin
 * @date 2018/2/27
 * @time 23:03
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystrix.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
