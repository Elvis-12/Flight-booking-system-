/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;

/**
 *
 * @author HP
 */

public class Seats {
   
    private int seat_id;
    private String seat_number;
    private String seat_type;
    private boolean status;
//    @ManyToOne
//    @JoinColumn(name = "flight_id")
//    private Flights theflight;

    public Seats() {
    }

    public Seats(int seat_id, String seat_number, String seat_type, boolean status, Flights theflight) {
        this.seat_id = seat_id;
        this.seat_number = seat_number;
        this.seat_type = seat_type;
        this.status = status;
//        this.theflight = theflight;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

//    public Flights getTheflight() {
//        return theflight;
//    }
//
//    public void setTheflight(Flights theflight) {
//        this.theflight = theflight;
//    }
    
}
