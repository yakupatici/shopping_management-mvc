package com.code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Spring MVC Controller sınıfı
@Controller
public class LoginController {

    // Login sayfasını gösteren endpoint
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        // fancy-login.html template'ini döndür
        return "fancy-login";
    }

    // Erişim reddedildiğinde gösterilecek sayfa
    @GetMapping("/access-denied")
    public String showAccessDenied() {
        // access-denied.html template'ini döndür
        return "access-denied";
    }
}
