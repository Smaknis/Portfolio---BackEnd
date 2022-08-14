
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String institute;
    private String title;
    private String score;
    private String year_start;
    private String year_end;
    private String url_logo;
    private String person_id;

    public Education() {
    }

    public Education(Long id, String institute, String title, String score, String year_start, String year_end, String url_logo, String person_id) {
        this.id = id;
        this.institute = institute;
        this.title = title;
        this.score = score;
        this.year_start = year_start;
        this.year_end = year_end;
        this.url_logo = url_logo;
        this.person_id = person_id;
    }   
}
