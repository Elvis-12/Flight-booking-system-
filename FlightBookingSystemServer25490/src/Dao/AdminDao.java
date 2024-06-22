/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Admin;
import Model.Flights;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class AdminDao {
    public Admin addAdmin(Admin adminobj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(adminobj);
            tr.commit();
            ss.close();
            return adminobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Admin> alladmin(){
           try {
               Session ss = HibernateUtil.getSessionFactory().openSession();
               List<Admin> alladmin = ss.createQuery("SELECT adminobj FROM Admin adminobj").list();
               ss.close();
               return alladmin;
           } catch (Exception e) {
           }
        return null;
       }
}
