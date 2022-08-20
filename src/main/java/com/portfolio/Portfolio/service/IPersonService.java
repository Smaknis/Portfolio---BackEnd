
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Person;
import java.util.List;


public interface IPersonService {
    
    public List<Person> verPerson();
    
    public void agregarPerson (Person person);
    
    public void borrarPerson (Long id);
    
    public Person buscarPerson (Long id);
     
    public void editarPerson (Person person);
    
}
