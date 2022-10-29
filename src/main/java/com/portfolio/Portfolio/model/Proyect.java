
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
    
    private String name;
    private String description;
    private Long personId;
    private Boolean edit;

    public Proyect() {
    }

    public Proyect(Long id_proyect, String name, String description, Long personId, Boolean edit) {
        this.id_proyect = id_proyect;
        this.name = name;
        this.description = description;
        this.personId = personId;
        this.edit = edit;
    }
    
    
}
