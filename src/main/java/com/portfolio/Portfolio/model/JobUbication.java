
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
    private Long id;
    
    private String job_ubication;

    public JobUbication() {
    }

    public JobUbication(Long id, String job_ubication) {
        this.id = id;
        this.job_ubication = job_ubication;
    }
    
    
    
}
