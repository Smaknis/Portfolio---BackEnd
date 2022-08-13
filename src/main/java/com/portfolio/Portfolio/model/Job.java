
package com.portfolio.Portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Job {
    
    private Long id;
    private String position;
    private String company;
    private String date_start;
    private String date_end;
    private String actual_job;
    private String url_logo;
    private String person_id;
    private String job_ubication;
    private String journal_type_id;

    public Job() {
    }

    public Job(Long id, String position, String company, String date_start, String date_end, String actual_job, String url_logo, String person_id, String job_ubication, String journal_type_id) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.date_start = date_start;
        this.date_end = date_end;
        this.actual_job = actual_job;
        this.url_logo = url_logo;
        this.person_id = person_id;
        this.job_ubication = job_ubication;
        this.journal_type_id = journal_type_id;
    }
    
    
    
}
