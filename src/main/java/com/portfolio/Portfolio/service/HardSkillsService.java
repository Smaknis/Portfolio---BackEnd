
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.HardSkills;
import com.portfolio.Portfolio.repository.HardSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillsService implements IHardSkillsService{
    
    @Autowired
    public HardSkillsRepository hardRepo;
    
    @Override
    public List verHardSkills() {
        return hardRepo.findAll();
    }

    @Override
    public void agregarHardSkills(HardSkills hard) {
        hardRepo.save(hard);
    }

    @Override
    public void borrarHardSkills(Long id) {
        hardRepo.deleteById(id);
    }

    @Override
    public HardSkills buscarHardSkills(Long id) {
        return hardRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHardSkills(HardSkills hard) {
        hardRepo.save(hard);
    }
    
}
