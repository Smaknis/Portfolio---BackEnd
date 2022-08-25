
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Job;
import com.portfolio.Portfolio.repository.JobRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService implements IJobService{

    @Autowired
    public JobRepository jobRepo;
    
    @Override
    public List verJob() {
        return jobRepo.findAll();
    }

    @Override
    public void agregarJob(Job job) {
        jobRepo.save(job);
    }

    @Override
    public void borrarJob(Long id) {
        jobRepo.deleteById(id);
    }

    @Override
    public Job buscarJob(Long id) {
        return jobRepo.findById(id).orElse(null);
    }

    @Override
    public void editarJob(Job job) {
        jobRepo.save(job);
    }
    
    
}
