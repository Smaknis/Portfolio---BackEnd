
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.JobLocation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Portfolio.repository.JobLocationRepository;

@Service
public class JobLocationService implements IJobLocationService{
    @Autowired
    public JobLocationRepository jobUbicationRepo;
    
    @Override
    public List<JobLocation> verJobUbication() {
        return jobUbicationRepo.findAll();
    }

    @Override
    public void agregarJobUbication(JobLocation jobu) {
        jobUbicationRepo.save(jobu);
    }

    @Override
    public void borrarJobUbication(Long id) {
        jobUbicationRepo.deleteById(id);
    }

    @Override
    public JobLocation buscarJobUbication(Long id) {
        return jobUbicationRepo.findById(id).orElse(null);
    }

    @Override
    public void editarJobUbication(JobLocation jobu) {
        jobUbicationRepo.save(jobu);
    }
}
