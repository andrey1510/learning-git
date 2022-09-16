package com.example.somecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomeCodeApplication {

    public String s = "Some code";
    int i;
    long l = 2;
    char c;

    public static void main(String[] args) {
        SpringApplication.run(SomeCodeApplication.class, args);
    }




}
