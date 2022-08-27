
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "HARDSKILLS")
public class HardSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_hard;
    
    private String title;
    private String score;
    private Long personId;

    public HardSkills() {
    }

    public HardSkills(Long id_hard, String title, String score, Long personId) {
        this.id_hard = id_hard;
        this.title = title;
        this.score = score;
        this.personId = personId;
    }
     
    
}
