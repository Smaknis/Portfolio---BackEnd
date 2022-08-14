
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Person;
import com.portfolio.Portfolio.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService{

    @Autowired
    public PersonRepository personRepo;
    
    @Override
    public List<Person> verPersonas() {
        return personRepo.findAll();
    }

    @Override
    public void agregarPerson(Person person) {
        personRepo.save(person);
    }

    @Override
    public void borrarPerson(Long id) {
        personRepo.deleteById(id);
    }

    @Override
    public Person buscarPerson(Long id) {
        return personRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPerson(Person person) {
        personRepo.save(person);
    }
    
}
