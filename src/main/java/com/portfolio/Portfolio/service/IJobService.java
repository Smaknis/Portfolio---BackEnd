
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Jobs;
import java.util.List;


public interface IJobService {
    
    public List<Jobs> verJob();
    
    public void agregarJob (Jobs job);
    
    public void borrarJob (Long id);
    
    public Jobs buscarJob (Long id);
     
    public void editarJob (Jobs job);
    
}
