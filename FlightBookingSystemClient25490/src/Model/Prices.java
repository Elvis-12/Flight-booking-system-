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

public class Prices {
    
    private int price_id;
    private String seat_type;
    private int price;
//    @ManyToOne
//    @JoinColumn(name="fligth_id")
//    private Flights theflight;

    public Prices() {
    }

    public Prices(int price_id, String seat_type, int price, Flights theflight) {
        this.price_id = price_id;
        this.seat_type = seat_type;
        this.price = price;
//        this.theflight = theflight;
    }

    public int getPrice_id() {
        return price_id;
    }

    public void setPrice_id(int price_id) {
        this.price_id = price_id;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public Flights getTheflight() {
//        return theflight;
//    }
//
//    public void setTheflight(Flights theflight) {
//        this.theflight = theflight;
//    }
    
}
