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

/**
 *
 * @author HP
 */

public class Flights implements Serializable{
   
    private Integer flight_id;
    private String airline_name;
    private String origin_airport;
    private String destination_airport;
    private String departure_date;
    private String arrival_date;
    private float price;

    public Flights() {
    }

    public Flights(Integer flight_id, String airline_name, String origin_airport, String destination_airport, String departure_date, String arrival_date, float price) {
        this.flight_id = flight_id;
        this.airline_name = airline_name;
        this.origin_airport = origin_airport;
        this.destination_airport = destination_airport;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.price = price;
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public String getOrigin_airport() {
        return origin_airport;
    }

    public void setOrigin_airport(String origin_airport) {
        this.origin_airport = origin_airport;
    }

    public String getDestination_airport() {
        return destination_airport;
    }

    public void setDestination_airport(String destination_airport) {
        this.destination_airport = destination_airport;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
