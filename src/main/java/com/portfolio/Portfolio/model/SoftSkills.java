
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
    private Long id;
    
    private String title;
    private String score;
    private String person_id;

    public SoftSkills() {
    }

    public SoftSkills(Long id, String title, String score, String person_id) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.person_id = person_id;
    }
    
    
    
}
