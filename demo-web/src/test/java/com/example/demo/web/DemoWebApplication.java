package com.example.demo.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author linjian
 * @date 2019/1/15
 */
@SpringBootApplication(scanBasePackages = "com.example.demo")
public class DemoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }
}