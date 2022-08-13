
package com.portfolio.Portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JobUbication {
    
    private Long id;
    private String job_ubication;

    public JobUbication() {
    }

    public JobUbication(Long id, String job_ubication) {
        this.id = id;
        this.job_ubication = job_ubication;
    }
    
    
    
}
