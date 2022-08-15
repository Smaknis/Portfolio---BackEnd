
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.JobUbication;
import com.portfolio.Portfolio.repository.JobUbicationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobUbicationService implements IJobUbicationService{
    @Autowired
    public JobUbicationRepository jobUbicationRepo;
    
    @Override
    public List<JobUbication> verJobUbication() {
        return jobUbicationRepo.findAll();
    }

    @Override
    public void agregarJobUbication(JobUbication jobu) {
        jobUbicationRepo.save(jobu);
    }

    @Override
    public void borrarJobUbication(Long id) {
        jobUbicationRepo.deleteById(id);
    }

    @Override
    public JobUbication buscarJobUbication(Long id) {
        return jobUbicationRepo.findById(id).orElse(null);
    }

    @Override
    public void editarJobUbication(JobUbication jobu) {
        jobUbicationRepo.save(jobu);
    }
}
