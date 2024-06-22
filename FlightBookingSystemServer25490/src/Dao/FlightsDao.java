/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Flights;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class FlightsDao {
    public Flights createFlights (Flights flightsobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(flightsobj);
            tr.commit();
            ss.close();
            return flightsobj;
        } catch (Exception e) {
        }
        return null;
    
    }
     public Flights updateFlights (Flights flightsobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(flightsobj);
            tr.commit();
            ss.close();
            return flightsobj;
        } catch (Exception e) {
        }
        return null;
    
     }
      public Flights deleteFlights (Flights flightsobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(flightsobj);
            tr.commit();
            ss.close();
            return flightsobj;
        } catch (Exception e) {
        }
        return null;
    
    }
       public Flights findFlights (Flights flightsobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Flights  theflight = (Flights)ss.get(Flights.class,flightsobj.getFlight_id());
            ss.close();
            return theflight;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
    }
       public List<Flights> allFlights(){
           try {
               Session ss = HibernateUtil.getSessionFactory().openSession();
               List<Flights> allFlights = ss.createQuery("SELECT flightobj FROM Flights flightobj").list();
               ss.close();
               return allFlights;
           } catch (Exception e) {
           }
        return null;
       }
}
