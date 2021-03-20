package com.example.jkubeerrorreproducer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping(value = "/hello", produces = "application/json")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World !");
    }
}
