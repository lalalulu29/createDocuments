package ru.kirill98.createDocuments.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ListOfDocumentsController {

    @GetMapping(value = "/generate_documents")
    public String GeneratedDocumentsList(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        System.out.println(principal.getName());
        return "generate_documents";
    }
}
