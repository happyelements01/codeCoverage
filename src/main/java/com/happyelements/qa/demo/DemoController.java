package com.happyelements.qa.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class DemoController {
    @GetMapping("/users/{id}")
    public String getUser(@PathVariable String id) {
        if (Objects.equals(id, "admin")) {
            return "Hello Admin!";
        }

        return "Hello User!";
    }
}
