
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Education;
import java.util.List;


public interface IEducationService {
    
    public List<Education> verEducation();
    
    public void agregarEducation (Education education);
    
    public void borrarEducation (Long id);
    
    public Education buscarEducation (Long id);
     
    public void editarEducation (Education education);
}
