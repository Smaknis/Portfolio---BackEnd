
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.SoftSkills;
import java.util.List;


public interface ISoftSkillsService {
    
    public List<SoftSkills> verSoftSkill();
    
    public void agregarSoftSkill (SoftSkills soft);
    
    public void borrarSoftSkill (Long id);
    
    public SoftSkills buscarSoftSkill (Long id);
     
    public void editarSoftSkill (SoftSkills soft);
}
