/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Flights;
import Model.Payments;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class PaymentsDao {
    public Payments createPayments(Payments paymentobj){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(paymentobj);
            tr.commit();
            ss.close();
            return paymentobj;
        } catch (Exception e) {
        }
        return null;
    }
     public Payments updatePayments(Payments paymentobj){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(paymentobj);
            tr.commit();
            ss.close();
            return paymentobj;
        } catch (Exception e) {
        }
        return null;
    }
      public Payments deletePayments(Payments paymentobj){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(paymentobj);
            tr.commit();
            ss.close();
            return paymentobj;
        } catch (Exception e) {
        }
        return null;
    }
      public Payments findPayments (Payments paymentobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Payments thepayment = (Payments)ss.get(Payments.class,paymentobj.getPayment_id());
            ss.close();
            return paymentobj;
        } catch (Exception e) {
        }
        return null;
    
    }
       public List<Payments> allpayments(){
           try {
               Session ss = HibernateUtil.getSessionFactory().openSession();
               List<Payments> allpayments = ss.createQuery("SELECT paymentobj FROM Payments paymentobj").list();
               ss.close();
               return allpayments;
           } catch (Exception e) {
           }
        return null;
       }
}
