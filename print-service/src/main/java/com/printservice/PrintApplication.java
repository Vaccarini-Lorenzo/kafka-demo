package com.printservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

// Producer
@SpringBootApplication
public class PrintApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrintApplication.class, args);
    }
}
