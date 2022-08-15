
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SoftSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id_soft;
    
    private String title_soft;
    private String score_soft;
    private String person_id;

    public SoftSkills() {
    }

    public SoftSkills(Long id_soft, String title_soft, String score_soft, String person_id) {
        this.id_soft = id_soft;
        this.title_soft = title_soft;
        this.score_soft = score_soft;
        this.person_id = person_id;
    }

    
    
}
