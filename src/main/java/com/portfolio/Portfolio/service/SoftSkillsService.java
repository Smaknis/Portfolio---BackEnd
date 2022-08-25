
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.SoftSkills;
import com.portfolio.Portfolio.repository.SoftSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillsService implements ISoftSkillsService{
    
    @Autowired
    public SoftSkillsRepository softRepo;
    
    @Override
    public List verSoftSkill() {
        return softRepo.findAll();
    }

    @Override
    public void agregarSoftSkill(SoftSkills soft) {
        softRepo.save(soft);
    }

    @Override
    public void borrarSoftSkill(Long id) {
        softRepo.deleteById(id);
    }

    @Override
    public SoftSkills buscarSoftSkill(Long id) {
        return softRepo.findById(id).orElse(null);
    }

    @Override
    public void editarSoftSkill(SoftSkills soft) {
        softRepo.save(soft);
        
    }
}
