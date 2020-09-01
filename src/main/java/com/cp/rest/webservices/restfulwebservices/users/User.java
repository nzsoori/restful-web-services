package com.cp.rest.webservices.restfulwebservices.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;


    private String surname;
    private String firstname;
    private String emailaddress;
    //default constructor with no arguments if you want something as a request body
    protected User()
    {

    }

    public User(Long id, String surname, String firstname, String emailaddress) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.emailaddress = emailaddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
}
