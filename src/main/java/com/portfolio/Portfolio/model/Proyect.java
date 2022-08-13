
package com.portfolio.Portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Proyect {
    
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
