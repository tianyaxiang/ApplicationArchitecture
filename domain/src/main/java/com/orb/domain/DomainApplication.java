package com.orb.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DomainApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(DomainApplication.class, args);
    }
}
