package com.example.testserve1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @GetMapping("/")
    public String Hello(){
        return "Hi from Service 2 : Port no 8091";
    }
}
