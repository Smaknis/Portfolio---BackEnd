
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Job;
import java.util.List;


public interface IJobService {
    
    public List<Job> verJob();
    
    public void agregarJob (Job job);
    
    public void borrarJob (Long id);
    
    public Job buscarJob (Long id);
     
    public void editarJob (Job job);
    
}
