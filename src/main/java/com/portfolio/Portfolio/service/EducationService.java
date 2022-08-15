
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Education;
import com.portfolio.Portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository educationRepo;
    
    @Override
    public List<Education> verEducation() {
        return educationRepo.findAll();
    }

    @Override
    public void agregarEducation(Education education) {
        educationRepo.save(education);
    }

    @Override
    public void borrarEducation(Long id) {
        educationRepo.deleteById(id);
    }

    @Override
    public Education buscarEducation(Long id) {
        return educationRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducation(Education education) {
        educationRepo.save(education);
    }
}
