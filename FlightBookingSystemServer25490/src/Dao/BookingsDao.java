/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Bookings;
import Model.Flights;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class BookingsDao {

    public Bookings createBookings(Bookings bookingobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(bookingobj);
            tr.commit();
            ss.close();
            return bookingobj;
        } catch (Exception e) {
        }
        return null;

    }

    public Bookings updateBookings(Bookings bookingobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(bookingobj);
            tr.commit();
            ss.close();
            return bookingobj;
        } catch (Exception e) {
        }
        return null;

    }

    public Bookings deleteBookings(Bookings bookingobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(bookingobj);
            tr.commit();
            ss.close();
            return bookingobj;
        } catch (Exception e) {
        }
        return null;

    }

    public Bookings findBookings(Bookings bookingobj) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Bookings thebooking = (Bookings) ss.get(Bookings.class, bookingobj.getBooking_id());
            ss.close();
            return thebooking;
        } catch (Exception e) {
        }
        return null;

    }

    public List<Bookings> allBookings() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Bookings> allBookings = ss.createQuery("SELECT bookingobj FROM Bookings bookingobj").list();
            ss.close();
            return allBookings;
        } catch (Exception e) {
        }
        return null;
    }

    public List<Flights> find(String origin_airport, String destination_airport) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            // HQL query
            String hql = "FROM Flights WHERE origin_airport = :origin_airport AND destination_airport = :destination_airport";
            Query query = session.createQuery(hql);
            query.setParameter("origin_airport", origin_airport);
            query.setParameter("destination_airport", destination_airport);

            List<Flights> flights = query.list();
            System.out.println(flights);

            session.getTransaction().commit();
            return flights;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

}
