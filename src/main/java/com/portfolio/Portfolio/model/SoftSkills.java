
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "SOFTSKILLS")
public class SoftSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id_soft;
    
    private String title_soft;
    private String score_soft;
    private Long personId;

    public SoftSkills() {
    }

    public SoftSkills(Long id_soft, String title_soft, String score_soft, Long personId) {
        this.id_soft = id_soft;
        this.title_soft = title_soft;
        this.score_soft = score_soft;
        this.personId = personId;
    }

    
    
}
