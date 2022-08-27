
package com.portfolio.Portfolio.model;

import java.util.List;


public class Portfolio {
    private Person person;
	private List<Jobs> jobs;
        private List<Education> edu;
        private List<HardSkills> hard;
        private List<SoftSkills> soft;
        private List<Proyect> proy;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Jobs> getJob() {
		return jobs;
	}
	public void setJob(List<Jobs> jobs) {
		this.jobs = jobs;
	}
        public List<Education> getEducation() {
		return edu;
	}
	public void setEducation(List<Education> edu) {
		this.edu = edu;
	}
        public List<HardSkills> getHardSkills() {
		return hard;
	}
	public void setHardSkills(List<HardSkills> hard) {
		this.hard = hard;
	}
        public List<SoftSkills> getSoftSkills() {
		return soft;
	}
	public void setSoftSkills(List<SoftSkills> soft) {
		this.soft = soft;
	}
        public List<Proyect> getProyect() {
		return proy;
	}
	public void setProyect(List<Proyect> proy) {
		this.proy = proy;
	}

    public Portfolio() {
    }

    public Portfolio(Person person, List<Jobs> jobs, List<Education> edu, List<HardSkills> hard, List<SoftSkills> soft, List<Proyect> proy) {
        this.person = person;
        this.jobs = jobs;
        this.edu = edu;
        this.hard = hard;
        this.soft = soft;
        this.proy = proy;
    }
       
}
