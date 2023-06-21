package com.test.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {


    @GetMapping("/")
    public String test(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Run a hard 5k";

    }

    @GetMapping("/winner")
    public String winner(){
        return "winner winner chicken dinner!";

    }







}
