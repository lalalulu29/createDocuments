package ru.kirill98.createDocuments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainViewController {
    @GetMapping("/")
    public String getTestPage(Model model) {
        return "main_page";
    }
}
