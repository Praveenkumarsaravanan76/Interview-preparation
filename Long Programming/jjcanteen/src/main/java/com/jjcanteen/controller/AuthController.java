package com.jjcanteen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/student-page")
    public String student() {
        return "student";
    }

    @GetMapping("/admin-page")
    public String admin() {
        return "admin";
    }
}