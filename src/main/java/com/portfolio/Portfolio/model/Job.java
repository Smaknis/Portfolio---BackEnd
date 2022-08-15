
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Job {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_job;
    
    private String position_job;
    private String company_job;
    private String date_start_job;
    private String date_end_job;
    private String actual_job;
    private String url_logo_job;
    private String person_id;
    private String job_ubication;
    private String journal_type_id;

    public Job() {
    }

    public Job(Long id_job, String position_job, String company_job, String date_start_job, String date_end_job, String actual_job, String url_logo_job, String person_id, String job_ubication, String journal_type_id) {
        this.id_job = id_job;
        this.position_job = position_job;
        this.company_job = company_job;
        this.date_start_job = date_start_job;
        this.date_end_job = date_end_job;
        this.actual_job = actual_job;
        this.url_logo_job = url_logo_job;
        this.person_id = person_id;
        this.job_ubication = job_ubication;
        this.journal_type_id = journal_type_id;
    }

  
      
}
