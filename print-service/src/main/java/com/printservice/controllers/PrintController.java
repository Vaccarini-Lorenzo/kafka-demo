package com.printservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PrintController {
    @Value("${printString:Hello default}")
    private String message;

    @GetMapping("/print")
    String getMessage() {
        return this.message;
    }
}