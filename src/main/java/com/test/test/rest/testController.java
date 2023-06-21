package com.test.test.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    //Property injection from application.properties file
    @Value("${datasheet.name}")
    private String datasheetName;
    @Value("${faction.name}")
    private String factionName;


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

    @GetMapping("/datasheet")
    public String datasheet(){
        return datasheetName +  " - " + factionName;
    }







}
