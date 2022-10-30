
package com.portfolio.Portfolio.controller;

import com.portfolio.Portfolio.model.Education;
import com.portfolio.Portfolio.model.HardSkills;
import com.portfolio.Portfolio.model.Jobs;
import com.portfolio.Portfolio.model.Person;
import com.portfolio.Portfolio.model.Portfolio;
import com.portfolio.Portfolio.model.Proyect;
import com.portfolio.Portfolio.model.SoftSkills;
import com.portfolio.Portfolio.service.IEducationService;
import com.portfolio.Portfolio.service.IHardSkillsService;
import com.portfolio.Portfolio.service.IJobService;
import com.portfolio.Portfolio.service.IPersonService;
import com.portfolio.Portfolio.service.ISoftSkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.Portfolio.service.IPortfolioService;
import com.portfolio.Portfolio.service.IProyect;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "https://portfolio-sergio-miguel-maknis.web.app/") //sirve para que el front se pueda conectar con esta backend
public class controller {
    
    @Autowired
    private IPortfolioService portfolioServ;
    
    @GetMapping("/portfolio/{personId}")
    @ResponseBody
    Portfolio getPortfolio(@PathVariable Long personId) {
	return portfolioServ.getPortfolio(personId);
    }
    
    @Autowired
    private IPersonService personServ;
        
    @PostMapping ("/new/person")
    public void agregarPerson(@RequestBody Person person){
       personServ.agregarPerson(person);
    
    }
       
    @GetMapping ("/ver/person")
    @ResponseBody
    public List<Person> verPerson(){
        return personServ.verPerson();
    }
    
    @DeleteMapping ("/delete/person/{Id}")
    public void borrarPerson (@PathVariable Long Id) {
        personServ.borrarPerson(Id);
    }
    
    @PutMapping ("/edit/person/{id}")
    public void editarPerson (@PathVariable Long id, @RequestBody Person person){
        personServ.editarPerson(person);
    }
    
    @Autowired
    private IJobService jobServ;
    
    @GetMapping ("/jobs")
    @ResponseBody
    public List<Jobs> verJobs () {
        
        return jobServ.verJob();
    }
    
    @PostMapping ("/newjob/job")
    public void agregarjob(@RequestBody Jobs job){
       jobServ.agregarJob(job);
    
    }
    
    @DeleteMapping ("/deletejob/{Id}")
    public void borrarJob (@PathVariable Long Id) {
        jobServ.borrarJob(Id);
    }
    
    @PutMapping ("/editjob/{id}")
    public void editarJob (@PathVariable Long id, @RequestBody Jobs job){
        jobServ.editarJob(job);
    }
    
    @Autowired
    private IEducationService eduServ;
    
    @GetMapping ("/education")
    @ResponseBody
    public List<Education> verEducation () {
        
        return eduServ.verEducation();
    }
    
    @PostMapping ("/newedu/edu")
    public void agregarEducation(@RequestBody Education edu){
       eduServ.agregarEducation(edu);
    
    }
    
    @DeleteMapping ("/deleteedu/{Id}")
    public void borrarEducation (@PathVariable Long Id) {
        eduServ.borrarEducation(Id);
    }
    
    @PutMapping ("/editedu/{id}")
    public void editarEducation (@PathVariable Long id, @RequestBody Education edu){
        eduServ.editarEducation(edu);
    }
    
    @Autowired
    private IHardSkillsService hardServ;
    
    @GetMapping ("/hard")
    @ResponseBody
    public List<HardSkills> verHardSkills () {
        
        return hardServ.verHardSkills();
    }
    
    @PostMapping ("/newhard/hard")
    public void agregarHardSkills(@RequestBody HardSkills hard){
       hardServ.agregarHardSkills(hard);
    
    }
    
    @DeleteMapping ("/deletehard/{Id}")
    public void borrarHardSkills (@PathVariable Long Id) {
        hardServ.borrarHardSkills(Id);
    }
    
    @PutMapping ("/edithard/{id}")
    public void editarHardSkills (@PathVariable Long id, @RequestBody HardSkills hard){
        hardServ.editarHardSkills(hard);
    }
   
    @Autowired
    private ISoftSkillsService softServ;
    
    @GetMapping ("/soft")
    @ResponseBody
    public List<SoftSkills> verSoftSkill () {
        
        return softServ.verSoftSkill();
    }
    
    @PostMapping ("/newsoft/soft")
    public void agregarSoftSkill(@RequestBody SoftSkills soft){
       softServ.agregarSoftSkill(soft);
    
    }
    
    @DeleteMapping ("/deletesoft/{Id}")
    public void borrarSoftSkill (@PathVariable Long Id) {
        softServ.borrarSoftSkill(Id);
    }
    
    @PutMapping ("/editsoft/{id}")
    public void editarSoftSkill (@PathVariable Long id, @RequestBody SoftSkills soft){
        softServ.editarSoftSkill(soft);
    }
    
    @Autowired
    private IProyect proyServ;
    
    @GetMapping ("/proy")
    @ResponseBody
    public List<Proyect> verProyect () {
        
        return proyServ.verProyect();
    }
    
    @PostMapping ("/newproyect/proy")
    public void agregarProyect(@RequestBody Proyect proy){
       proyServ.agregarProyect(proy);
    
    }
    
    @DeleteMapping ("/deleteproy/{Id}")
    public void borrarproyect (@PathVariable Long Id) {
        proyServ.borrarProyect(Id);
    }
    
    @PutMapping ("/editproy/{id}")
    public void editarProyect (@PathVariable Long id, @RequestBody Proyect proy){
        proyServ.editarProyect(proy);
    }
}
