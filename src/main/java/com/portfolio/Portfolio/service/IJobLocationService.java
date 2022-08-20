
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.JobLocation;
import java.util.List;


public interface IJobLocationService {
    
    public List<JobLocation> verJobUbication();
    
    public void agregarJobUbication (JobLocation jobu);
    
    public void borrarJobUbication(Long id);
    
    public JobLocation buscarJobUbication (Long id);
     
    public void editarJobUbication (JobLocation jobu);
}
