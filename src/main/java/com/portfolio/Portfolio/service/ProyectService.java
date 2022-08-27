
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Proyect;
import com.portfolio.Portfolio.repository.ProyectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectService implements IProyect{
    
    @Autowired
    public ProyectRepository proyRepo;
    
    @Override
    public List verProyect() {
        return proyRepo.findAll();
    }

    @Override
    public void agregarProyect(Proyect proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyect(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyect buscarProyect(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyect(Proyect proy) {
        proyRepo.save(proy);
    }
}
