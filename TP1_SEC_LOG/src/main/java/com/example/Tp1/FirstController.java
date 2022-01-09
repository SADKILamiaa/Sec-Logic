package com.example.Tp1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class FirstController {

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        return "index.html";
    }

    @GetMapping("/Login")
    public String Login(Map<String, Object> model) {
        return "Login.html";
    }

    @GetMapping("/Admin")
    public String Admin(Map<String, Object> model) {
        return "Admin.html";
    }

    @GetMapping("/User")
    public String User(Map<String, Object> model) {
        return "CompteUser.html";
    }
}
