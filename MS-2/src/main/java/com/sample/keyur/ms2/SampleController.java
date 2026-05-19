package com.sample.keyur.ms2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {

    @Autowired
    private InstanceInformationService service;

    @GetMapping("/")
    public String hello(){
        return "Hello Currency Exchange "+service.retrieveInstanceInfo();
    }

    @GetMapping("/dollar/price")
    public int dollarPrice(){
        return 90;
    }


}
