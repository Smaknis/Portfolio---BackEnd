
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "PROYECT")
public class Proyect {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id_proyect;
    
    private String name_proyect;
    private String description_proyect;
    private Long personId;

    public Proyect() {
    }

    public Proyect(Long id_proyect, String name_proyect, String description_proyect, Long personId) {
        this.id_proyect = id_proyect;
        this.name_proyect = name_proyect;
        this.description_proyect = description_proyect;
        this.personId = personId;
    }
    
    
}
