package com.sample.keyur.ms2;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

import java.util.Map;

public class Utils{



  /*  RestClient customClient = RestClient.builder()
            .requestFactory(new HttpComponentsClientHttpRequestFactory())
        //    .messageConverters(converters -> converters.add(new MyCustomMessageConverter()))
            .baseUrl("https://example.com")
         //   .defaultUriVariables(Map.of("variable", "foo"))
        //    .defaultHeader("My-Header", "Foo")
           // .requestInterceptor(myCustomInterceptor)
            //.requestInitializer(myCustomInitializer)
            .build();*/

    RestClient defaultClient = RestClient.create();
    ResponseEntity<String> result = defaultClient.get()
            .uri("https://example.com")
            .retrieve()
            .toEntity(String.class);


}
