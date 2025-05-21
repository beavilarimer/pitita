package com.pititasCloset.closet.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "✅ Pitita Spring Boot App is running!";
    }
}
