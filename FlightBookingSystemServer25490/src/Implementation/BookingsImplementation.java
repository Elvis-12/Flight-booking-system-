/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.BookingsDao;
import Model.Bookings;
import Model.Flights;
import Service.BookingsService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author HP
 */
public class BookingsImplementation  extends UnicastRemoteObject implements BookingsService{
    BookingsDao dao = new BookingsDao();

    public BookingsImplementation() throws Exception {
    }
    
    @Override
    public Bookings createBookings(Bookings bookingobj) throws RemoteException {
        return dao.createBookings(bookingobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bookings updateBookings(Bookings bookingobj) throws RemoteException {
        return dao.updateBookings(bookingobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bookings deleteBookings(Bookings bookingobj) throws RemoteException {
        return dao.deleteBookings(bookingobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bookings findBookings(Bookings bookingobj) throws RemoteException {
        return dao.findBookings(bookingobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bookings> allBookings() throws RemoteException {
        return dao.allBookings(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Flights> find(String origin_airport, String destination_airport) throws RemoteException{
    return dao.find(origin_airport, destination_airport);
    }
}
