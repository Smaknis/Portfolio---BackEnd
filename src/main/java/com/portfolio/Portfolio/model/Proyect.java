
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
    private Long id;
    
    private String name;
    private String description;
    private String person_id;

    public Proyect() {
    }

    public Proyect(Long id, String name, String description, String person_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.person_id = person_id;
    }
    
    
    
}
