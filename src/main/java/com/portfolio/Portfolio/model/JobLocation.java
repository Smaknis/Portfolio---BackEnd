
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "JOBLOCATION")
public class JobLocation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   
    private Long id_job_location;
    
    private String job_location;

    public JobLocation() {
    }

    public JobLocation(Long id_job_location, String job_location) {
        this.id_job_location = id_job_location;
        this.job_location = job_location;
    }

    
    
}
