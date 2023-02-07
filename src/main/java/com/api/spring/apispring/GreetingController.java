package com.api.spring.apispring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.apispring.models.ResponseContent;

/**
 * GreetingController
 */

 @RestController
public class GreetingController {

    private static final String template ="Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/hello")
    public ResponseContent getHello(    
        @RequestParam(value = "name",defaultValue = "World") 
        String name){

        return new ResponseContent(counter.getAndIncrement(), String.format(template,name ));
    }

}