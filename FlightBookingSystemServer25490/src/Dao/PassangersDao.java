/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Passangers;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class PassangersDao {
     public Passangers createPassangers (Passangers passangerobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(passangerobj);
            tr.commit();
            ss.close();
            return passangerobj;
        } catch (Exception e) {
        }
        return null;
    
    }
     public Passangers updatePassangers (Passangers passangerobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(passangerobj);
            tr.commit();
            ss.close();
            return passangerobj;
        } catch (Exception e) {
        }
        return null;
    
     }
      public Passangers deletePassangers (Passangers passangerobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(passangerobj);
            tr.commit();
            ss.close();
            return passangerobj;
        } catch (Exception e) {
        }
        return null;
    
    }
       public Passangers findPassangers (Passangers passangerobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Passangers  thepassanger = (Passangers)ss.get(Passangers.class,passangerobj.getPassenger_id());
            ss.close();
            return thepassanger;
        } catch (Exception e) {
        }
        return null;
    
    }
       public List<Passangers> allPassangers(){
           try {
               Session ss = HibernateUtil.getSessionFactory().openSession();
               List<Passangers> allPassangers = ss.createQuery("SELECT passangerobj FROM Passangers passangerobj").list();
               ss.close();
               return allPassangers;
           } catch (Exception e) {
           }
        return null;
       }
}
