
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "JOBS")
public class Jobs {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_job;
    
    private String position;
    private String company;
    private String journal_type;
    private String date_start;
    private String date_end;
    private String location_job;
    private String url_logo_job;
    private Long personId;
    
    

    public Jobs() {
    }

    public Jobs(Long id_job, String position, String company, String journal_type, String date_start, String date_end, String location_job, String url_logo_job, Long personId) {
        this.id_job = id_job;
        this.position = position;
        this.company = company;
        this.journal_type = journal_type;
        this.date_start = date_start;
        this.date_end = date_end;
        this.location_job = location_job;
        this.url_logo_job = url_logo_job;
        this.personId = personId;
    }
      
}
