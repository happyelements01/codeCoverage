package com.happyelements.qa.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class Demo1Controller {
    @GetMapping("/users1/{id}")
    public String getUser1(@PathVariable String id) {
        if (Objects.equals(id, "admin")) {
            return "Hello 1 Admin!";
        }

        return "Hello 1 User!";
    }

    @GetMapping("/users2/{id}")
    public String getUser2(@PathVariable String id) {
        if (Objects.equals(id, "admin")) {
            return "Hello 2 Admin!";
        }

        return "Hello 2 User!";
    }
}
