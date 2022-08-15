
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
    private Long id_education;
    
    private String institute_education;
    private String title_education;
    private String score_education;
    private String year_start_education;
    private String year_end_education;
    private String url_logo_education;
    private String person_id;

    public Education() {
    }

    public Education(Long id_education, String institute_education, String title_education, String score_education, String year_start_education, String year_end_education, String url_logo_education, String person_id) {
        this.id_education = id_education;
        this.institute_education = institute_education;
        this.title_education = title_education;
        this.score_education = score_education;
        this.year_start_education = year_start_education;
        this.year_end_education = year_end_education;
        this.url_logo_education = url_logo_education;
        this.person_id = person_id;
    }
}
