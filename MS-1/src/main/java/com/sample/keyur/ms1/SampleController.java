package com.sample.keyur.ms1;

import com.sample.keyur.ms1.com.sample.keyur.ms1.InstanceInformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@Slf4j
@RestController
public class SampleController {


    @Autowired
    private InstanceInformationService service;

    @Value("${ms2.api}")
    private String ms2API;

    @GetMapping(value = "/")
    public String hello(){
        return "Hello Currency Converter "+service.retrieveInstanceInfo();
    }

    @GetMapping(value = "/dollar/to/inr/{dollarcount}")
    public int dollarToInr(@PathVariable("dollarcount") int dollarCount){
        System.out.println("ms2API = "+ms2API);
        RestClient defaultClient = RestClient.create();
        ResponseEntity<String> result = defaultClient.get()
                .uri(ms2API)
                .retrieve()
                .toEntity(String.class);
        log.info(" -----Result------- "+result.getBody());
        int dollarprice = Integer.parseInt(result.getBody().toString());
//                Integer.getInteger(result.getBody().toString());
        int totalInr = dollarCount*dollarprice;


        return totalInr;
    }
}
