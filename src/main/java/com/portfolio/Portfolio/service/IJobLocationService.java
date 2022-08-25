
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.JobLocation;
import java.util.List;


public interface IJobLocationService {
    
    public List<JobLocation> verJobLocation();
    
    public void agregarJobLocation (JobLocation jobu);
    
    public void borrarJobLocation(Long id);
    
    public JobLocation buscarJobLocation (Long id);
     
    public void editarJobLocation (JobLocation jobu);
}
