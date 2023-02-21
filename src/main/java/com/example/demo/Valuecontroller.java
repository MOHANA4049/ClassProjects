package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
@RestController
public class Valuecontroller {
    @Value("${hello.value}")
    private String welcomeSalutation;
    @GetMapping
    public String home()
    {
    	return welcomeSalutation+",World!";
    }
}