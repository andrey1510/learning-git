package com.example.somecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomeCodeApplication {

    public String s = "Another code";
    int i;
    long l;

    public static void main(String[] args) {
        SpringApplication.run(SomeCodeApplication.class, args);
    }




}
