
package com.portfolio.Portfolio.controller;

import com.portfolio.Portfolio.model.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    List<Person> listaPersonas = new ArrayList();
    
    @GetMapping ("/")
    @ResponseBody
    public Person cargarDatos(Person persona){
        return persona;
    }
    
    @PostMapping ("/new/person")
    public void agregarPerson(@RequestBody Person person){
        listaPersonas.add(person);
    
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Person> verPersonas(){
        return listaPersonas;
    }
}
