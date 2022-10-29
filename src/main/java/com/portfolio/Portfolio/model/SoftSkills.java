
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
    
    private String title;
    private int score;
    private Long personId;
    private Boolean edit;

    public SoftSkills() {
    }

    public SoftSkills(Long id_soft, String title, int score, Long personId, Boolean edit) {
        this.id_soft = id_soft;
        this.title = title;
        this.score = score;
        this.personId = personId;
        this.edit = edit;
    }

    
    
}
