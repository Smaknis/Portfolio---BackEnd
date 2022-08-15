
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HardSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_hard;
    
    private String title_hard;
    private String score_hard;
    private String person_id;

    public HardSkills() {
    }

    public HardSkills(Long id_hard, String title_hard, String score_hard, String person_id) {
        this.id_hard = id_hard;
        this.title_hard = title_hard;
        this.score_hard = score_hard;
        this.person_id = person_id;
    }
     
    
}
