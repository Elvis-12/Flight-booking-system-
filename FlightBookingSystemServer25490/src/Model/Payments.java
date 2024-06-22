/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author HP
 */
@Entity
public class Payments {
    @Id
    @Column(name= "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_id;
    private String payment_method;
    private int amount;
    private Date payment_date;
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Bookings thebooking;

    public Payments() {
    }

    public Payments(int payment_id, String payment_method, int amount, Date payment_date, Bookings thebooking) {
        this.payment_id = payment_id;
        this.payment_method = payment_method;
        this.amount = amount;
        this.payment_date = payment_date;
        this.thebooking = thebooking;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public Bookings getThebooking() {
        return thebooking;
    }

    public void setThebooking(Bookings thebooking) {
        this.thebooking = thebooking;
    }
    
}
