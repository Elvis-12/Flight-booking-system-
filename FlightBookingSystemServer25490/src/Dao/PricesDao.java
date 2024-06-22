/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Flights;
import Model.Prices;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class PricesDao {
    public Prices createprices(Prices priceobj){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(priceobj);
            tr.commit();
            ss.close();
            return priceobj;
        } catch (Exception e) {
        }
        return null;
    }
    public Prices updateprices(Prices priceobj){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(priceobj);
            tr.commit();
            ss.close();
            return priceobj;
        } catch (Exception e) {
        }
        return null;
    }
    public Prices deleteprices(Prices priceobj){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(priceobj);
            tr.commit();
            ss.close();
            return priceobj;
        } catch (Exception e) {
        }
        return null;
    }
    public Prices findprices(Prices priceobj){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
            Prices theprice = (Prices)ss.get(Prices.class,priceobj.getPrice_id());
            ss.close();
            return priceobj;
        } catch (Exception e) {
        }
        return null;
    }
     public List<Prices> allprices(){
           try {
               Session ss = HibernateUtil.getSessionFactory().openSession();
               List<Prices> allprices = ss.createQuery("SELECT pricetobj FROM Prices priceobj").list();
               ss.close();
               return allprices;
           } catch (Exception e) {
           }
        return null;
       }
}
