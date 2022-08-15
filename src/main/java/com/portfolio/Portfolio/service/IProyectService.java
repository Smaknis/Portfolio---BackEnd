
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Proyect;
import java.util.List;


public interface IProyectService {
    
    public List<Proyect> verProyect();
    
    public void agregarProyect (Proyect proyect);
    
    public void borrarProyect (Long id);
    
    public Proyect buscarProyect (Long id);
     
    public void editarProyect (Proyect proyect);
    
}
