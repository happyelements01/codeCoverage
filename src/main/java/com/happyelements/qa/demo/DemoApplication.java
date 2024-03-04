package com.happyelements.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));

//        System.out.println(System.getenv());
//        System.out.println(System.getenv("CLASSPATH"));
//        System.out.println(System.getProperties());
//        System.out.println(System.getProperty("java.class.path"));
//        System.out.println(System.getProperty("java.ext.dirs"));

        SpringApplication.run(DemoApplication.class, args);
    }
}
