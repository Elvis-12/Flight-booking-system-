/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import javax.persistence.Column;

import java.io.Serializable;

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

public class Bookings implements Serializable {
    private static final long serialVersionUID = 362644039869177969l;
     private Integer booking_id ;
    private Integer flight_id;
    private Integer passenger_id;
    private String classes;
    private Float price;
    private String seats;
    private String booking_date;
//    @ManyToOne
//    @JoinColumn(name = "flight_id")
//    private Flights theflight;
//    @ManyToOne
//    @JoinColumn(name = "passanger_id")
//    private Passangers thepassanger;
    

    public Bookings() {
    }

    public Bookings(Integer booking_id, Integer flight_id, Integer passenger_id, String classes, Float price, String seats, String booking_date, Flights theflight) {
        this.booking_id = booking_id;
        this.flight_id = flight_id;
        this.passenger_id = passenger_id;
        this.classes = classes;
        this.price = price;
        this.seats = seats;
        this.booking_date = booking_date;
//        this.theflight = theflight;
    }

    public Integer getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Integer booking_id) {
        this.booking_id = booking_id;
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Integer getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(Integer passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

//    public Flights getTheflight() {
//        return theflight;
//    }
//
//    public void setTheflight(Flights theflight) {
//        this.theflight = theflight;
//    }
    
}
