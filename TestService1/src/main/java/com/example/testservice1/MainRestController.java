package com.example.testservice1;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainRestController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hi from Service 1: Port 8083";
    }

    @GetMapping("fromservice2")
    public ResponseEntity<String> getData(){
        RestTemplate restTemplate=new RestTemplate();
        String fooResourceUrl="http://localhost:8072/test-service-2";
        ResponseEntity<String> response=restTemplate.getForEntity(fooResourceUrl,String.class);
        return response;
    }

}
