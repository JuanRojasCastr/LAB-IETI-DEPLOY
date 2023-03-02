package edu.escuelaing.ieti.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

    @GetMapping({"/", "/home", "/status"})
    public String getName(){
        return "Mi name is Yesid Camilo Mora Barbosa";
    }
}
