package com.oauth2.SpringSecurityApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot SSO Login App";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Welcome to secured Page";
    }
}
