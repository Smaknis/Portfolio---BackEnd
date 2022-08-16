
package com.portfolio.Portfolio.controller;

import com.portfolio.Portfolio.model.Education;
import com.portfolio.Portfolio.model.HardSkills;
import com.portfolio.Portfolio.model.Job;
import com.portfolio.Portfolio.model.JobUbication;
import com.portfolio.Portfolio.model.JournalType;
import com.portfolio.Portfolio.model.Person;
import com.portfolio.Portfolio.model.Proyect;
import com.portfolio.Portfolio.model.SoftSkills;
import com.portfolio.Portfolio.service.IEducationService;
import com.portfolio.Portfolio.service.IHardSkillsService;
import com.portfolio.Portfolio.service.IJobService;
import com.portfolio.Portfolio.service.IJobUbicationService;
import com.portfolio.Portfolio.service.IJournalTypeService;
import com.portfolio.Portfolio.service.IPersonService;
import com.portfolio.Portfolio.service.IProyectService;
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

@RestController
public class controller {
    
    @Autowired
    private IPersonService personServ;
    
    @GetMapping ("/")
    @ResponseBody
    public Person cargarDatos(Person persona){
        return persona;
    }
    
    @PostMapping ("/new/person")
    public void agregarPerson(@RequestBody Person person){
       personServ.agregarPerson(person);
    
    }
       
    @GetMapping ("/ver/person")
    @ResponseBody
    public List<Person> verPersonas(){
        return personServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/person/{Id}")
    public void borrarPerson (@PathVariable Long Id) {
        personServ.borrarPerson(Id);
    }
    
    @PutMapping ("/edit/person/{id}")
    public void editarPersona (@PathVariable Long id, @RequestBody Person person){
        personServ.editarPerson(person);
    }
    
    @Autowired
    private IJobService jobServ;
    
    @GetMapping ("/jobs")
    @ResponseBody
    public List<Job> verJobs () {
        
        return jobServ.verJob();
    }
    
    @PostMapping ("/newjob/job")
    public void agregarjob(@RequestBody Job job){
       jobServ.agregarJob(job);
    
    }
    
    @DeleteMapping ("/deletejob/{Id}")
    public void borrarJob (@PathVariable Long Id) {
        jobServ.borrarJob(Id);
    }
    
    @PutMapping ("/editjob/{id}")
    public void editarJob (@PathVariable Long id, @RequestBody Job job){
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
    private IJobUbicationService jobuServ;
    
    @GetMapping ("/jobu")
    @ResponseBody
    public List<JobUbication> verJobUbication () {
        
        return jobuServ.verJobUbication();
    }
    
    @PostMapping ("/newjobu/jobu")
    public void agregarJobUbication(@RequestBody JobUbication jobu){
       jobuServ.agregarJobUbication(jobu);
    
    }
    
    @DeleteMapping ("/deletejobu/{Id}")
    public void borrarJobUbication (@PathVariable Long Id) {
        jobuServ.borrarJobUbication(Id);
    }
    
    @PutMapping ("/editjobu/{id}")
    public void editarJobUbication (@PathVariable Long id, @RequestBody JobUbication jobu){
        jobuServ.editarJobUbication(jobu);
    }
    
    @Autowired
    private IJournalTypeService journalServ;
    
    @GetMapping ("/journal")
    @ResponseBody
    public List<JournalType> verJournalType () {
        
        return journalServ.verJournalType();
    }
    
    @PostMapping ("/newjournal/journal")
    public void agregarJournalType(@RequestBody JournalType journal){
       journalServ.agregarJournalType(journal);
    
    }
    
    @DeleteMapping ("/deletejournal/{Id}")
    public void borrarJournalType (@PathVariable Long Id) {
        journalServ.borrarJournalType(Id);
    }
    
    @PutMapping ("/editjournal/{id}")
    public void editarJournalType (@PathVariable Long id, @RequestBody JournalType journal){
        journalServ.editarJournalType(journal);
    }
    
    @Autowired
    private IProyectService proyectServ;
    
    @GetMapping ("/proyect")
    @ResponseBody
    public List<Proyect> verProyect () {
        
        return proyectServ.verProyect();
    }
    
    @PostMapping ("/newproyect/proyect")
    public void agregarProyect(@RequestBody Proyect proy){
       proyectServ.agregarProyect(proy);
    
    }
    
    @DeleteMapping ("/deleteproyect/{Id}")
    public void borrarProyect (@PathVariable Long Id) {
        proyectServ.borrarProyect(Id);
    }
    
    @PutMapping ("/editproyect/{id}")
    public void editarProyect (@PathVariable Long id, @RequestBody Proyect proy){
        proyectServ.editarProyect(proy);
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
}
