package com.code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Ana sayfa ve rol bazlı sayfaları yöneten controller
@Controller
public class DemoController {

    // Ana sayfa endpoint'i
    @GetMapping("/")
    public String showHome() {
        // home.html template'ini döndür
        return "home";
    }

    // Yönetici sayfası endpoint'i - Sadece MANAGER rolü erişebilir
    @GetMapping("/leaders")
    public String showLeaders() {
        // leaders.html template'ini döndür
        return "leaders";
    }

    // Admin sayfası endpoint'i - Sadece ADMIN rolü erişebilir
    @GetMapping("/systems")
    public String showSystems() {
        // systems.html template'ini döndür
        return "systems";
    }
}
