/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Model.Seats;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class SeatsDao {
    public Seats createSeats(Seats seatobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(seatobj);
            tr.commit();
            ss.close();
            return seatobj;
        } catch (Exception e) {
        }
        return null;
    }
    public Seats updateSeats(Seats seatobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(seatobj);
            tr.commit();
            ss.close();
            return seatobj;
        } catch (Exception e) {
        }
        return null;
    }
    public Seats deleteSeats(Seats seatobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(seatobj);
            tr.commit();
            ss.close();
            return seatobj;
        } catch (Exception e) {
        }
        return null;
    }
     public Seats findseats (Seats seatobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Seats theseat = (Seats)ss.get(Seats.class,seatobj.getSeat_id());
            ss.close();
            return seatobj;
        } catch (Exception e) {
        }
        return null;
    
    }
       public List<Seats> allseats(){
           try {
               Session ss = HibernateUtil.getSessionFactory().openSession();
               List<Seats> allseats = ss.createQuery("SELECT seatobj FROM Seats seatobj").list();
               ss.close();
               return allseats;
           } catch (Exception e) {
           }
        return null;
       }
}
