package com.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/template")
@RequiredArgsConstructor
public class TemplateController {
    @GetMapping("/demo")
    public String demo() {
        System.out.println("revoke");
        return "hello";
    }
}
