package com.sample.keyur.ms2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {

    @GetMapping("/")
    public String hello(){
        return "Keyur";
    }

    @GetMapping("/dollar/price")
    public int dollarPrice(){
        return 90;
    }


}
