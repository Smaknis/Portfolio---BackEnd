
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyect {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id_proyect;
    
    private String name_proyect;
    private String description_proyect;
    private String person_id;

    public Proyect() {
    }

    public Proyect(Long id_proyect, String name_proyect, String description_proyect, String person_id) {
        this.id_proyect = id_proyect;
        this.name_proyect = name_proyect;
        this.description_proyect = description_proyect;
        this.person_id = person_id;
    }


    
}
