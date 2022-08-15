
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.HardSkills;
import java.util.List;


public interface IHardSkillsService {
    
    public List<HardSkills> verHardSkills();
    
    public void agregarHardSkills (HardSkills hard);
    
    public void borrarHardSkills (Long id);
    
    public HardSkills buscarHardSkills (Long id);
     
    public void editarHardSkills (HardSkills hard);
}
