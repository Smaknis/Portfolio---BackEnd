
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.JobLocation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Portfolio.repository.JobLocationRepository;

@Service
public class JobLocationService implements IJobLocationService{
    @Autowired
    public JobLocationRepository jobLocationRepo;
    
    @Override
    public List verJobLocation() {
        return jobLocationRepo.findAll();
    }

    @Override
    public void agregarJobLocation(JobLocation jobu) {
        jobLocationRepo.save(jobu);
    }

    @Override
    public void borrarJobLocation(Long id) {
        jobLocationRepo.deleteById(id);
    }

    @Override
    public JobLocation buscarJobLocation(Long id) {
        return jobLocationRepo.findById(id).orElse(null);
    }

    @Override
    public void editarJobLocation(JobLocation jobu) {
        jobLocationRepo.save(jobu);
    }
}
