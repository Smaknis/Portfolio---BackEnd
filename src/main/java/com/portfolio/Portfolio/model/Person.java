
package com.portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity (name = "PERSON")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String last_name;
    private String back_image;
    private String url_image;
    private String position;
    private String title;
    private String location;
    private String about1;
    private String about2;
    private String address;
    private String phone;
    private String email;
    private String birth_date;
    private String nationality;

    

    public Person() {
    }

    public Person(Long id, String name, String last_name, String back_image, String url_image, String position, String title, String location, String about1, String about2, String address, String phone, String email, String birth_date, String nationality) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.back_image = back_image;
        this.url_image = url_image;
        this.position = position;
        this.title = title;
        this.location = location;
        this.about1 = about1;
        this.about2 = about2;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birth_date = birth_date;
        this.nationality = nationality;
    }

 

    
}
