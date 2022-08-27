
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Education;
import com.portfolio.Portfolio.model.HardSkills;
import com.portfolio.Portfolio.model.Jobs;
import com.portfolio.Portfolio.model.Person;
import com.portfolio.Portfolio.model.Portfolio;
import com.portfolio.Portfolio.model.Proyect;
import com.portfolio.Portfolio.model.SoftSkills;
import com.portfolio.Portfolio.repository.EducationRepository;
import com.portfolio.Portfolio.repository.HardSkillsRepository;
import com.portfolio.Portfolio.repository.JobRepository;
import com.portfolio.Portfolio.repository.PersonRepository;
import com.portfolio.Portfolio.repository.ProyectRepository;
import com.portfolio.Portfolio.repository.SoftSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService implements IPortfolioService{
    
       
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private JobRepository jobRepository;
        
    @Autowired
    private EducationRepository educationRepository;
        
    @Autowired
    private HardSkillsRepository hardSkillsRepository;
        
    @Autowired
    private SoftSkillsRepository softSkillsRepository;
        
    @Autowired
    private ProyectRepository proyectRepository;
        
    
    
    
    @Override
	public List getPerson(){
            return personRepository.findAll();
	}

        
    
    @Override
	public Portfolio getPortfolio(Long personId) {
		
            
            Person person = personRepository.findById(personId).orElse(null);
            
                       
            List<Jobs> jobs = jobRepository.getJobByPersonId(personId);		

            List<Education> edu = educationRepository.getEducationByPersonId(personId);
            
            List<HardSkills> hard = hardSkillsRepository.getHardSkillsByPersonId(personId);	
            
            List<SoftSkills> soft = softSkillsRepository.getSoftSkillsByPersonId(personId);
            
            List<Proyect> proy = proyectRepository.getProyectByPersonId(personId);
              
            // coloca la informacion de las tablas el portfolio
            Portfolio portf = new Portfolio();
            portf.setPerson(person);
            portf.setJob(jobs);
            portf.setEducation(edu);
            portf.setHardSkills(hard);
            portf.setSoftSkills(soft);
            portf.setProyect(proy);
            		
            return portf;
    }

    
}
