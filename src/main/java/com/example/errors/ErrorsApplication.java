package com.example.errors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ErrorsApplication {

    @GetMapping("/ow")
    ResponseEntity<?> error() {
        return Math.random() > 0.5 ?
                ResponseEntity.ok().build() : ResponseEntity.internalServerError().build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ErrorsApplication.class, args);
    }

}
