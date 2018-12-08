package com.orb.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DomainApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("3");
        BigDecimal c = a.divide(b,2, BigDecimal.ROUND_HALF_UP);
        System.out.println(a+"/"+b+" = "+c);
        SpringApplication.run(DomainApplication.class, args);
    }
}
