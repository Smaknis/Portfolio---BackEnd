
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Proyect;
import com.portfolio.Portfolio.repository.ProyectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectService implements IProyectService{
    
    @Autowired
    public ProyectRepository proyectRepo;
    
    @Override
    public List<Proyect> verProyect() {
        return proyectRepo.findAll();
    }

    @Override
    public void agregarProyect(Proyect proyect) {
        proyectRepo.save(proyect);
    }

    @Override
    public void borrarProyect(Long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public Proyect buscarProyect(Long id) {
        return proyectRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyect(Proyect proyect) {
        proyectRepo.save(proyect);
    }
}
