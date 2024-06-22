/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
@Entity
public class Passangers implements Serializable{
    @Id
    @Column(name = "passanger_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passenger_id;
    private String first_name;
    private String last_name;
    private String passport_nbr;
    private String email;
    private String DOB;
    private String gender;
    private String contact ;

    public Passangers() {
    }

    public Passangers(Integer passenger_id, String first_name, String last_name, String passport_nbr, String email, String DOB, String gender, String contact) {
        this.passenger_id = passenger_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.passport_nbr = passport_nbr;
        this.email = email;
        this.DOB = DOB;
        this.gender = gender;
        this.contact = contact;
    }

    public Integer getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(Integer passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassport_nbr() {
        return passport_nbr;
    }

    public void setPassport_nbr(String passport_nbr) {
        this.passport_nbr = passport_nbr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
}
