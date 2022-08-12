
package com.portfolio.Portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @GetMapping ("/main")
    public String decirHola(){
        return "Hola mundo!";
    }
    
}
