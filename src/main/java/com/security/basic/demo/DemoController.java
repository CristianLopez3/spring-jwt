package com.security.basic.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> helloDemo(){
        return ResponseEntity.ok("Hello from the secured end point");
    }


}
