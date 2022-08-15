
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.JobUbication;
import java.util.List;


public interface IJobUbicationService {
    
    public List<JobUbication> verJobUbication();
    
    public void agregarJobUbication (JobUbication jobu);
    
    public void borrarJobUbication(Long id);
    
    public JobUbication buscarJobUbication (Long id);
     
    public void editarJobUbication (JobUbication jobu);
}
