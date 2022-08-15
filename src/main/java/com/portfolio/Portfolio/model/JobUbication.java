
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class JobUbication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   
    private Long id_job_ubication;
    
    private String job_ubication;

    public JobUbication() {
    }

    public JobUbication(Long id_job_ubication, String job_ubication) {
        this.id_job_ubication = id_job_ubication;
        this.job_ubication = job_ubication;
    }

    
    
}
