/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Bookings;
import Model.Flights;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface BookingsService extends Remote {
    Bookings createBookings (Bookings bookingobj) throws RemoteException;
    Bookings updateBookings (Bookings bookingobj) throws RemoteException;
    Bookings deleteBookings (Bookings bookingobj) throws RemoteException;
    Bookings findBookings (Bookings bookingobj) throws RemoteException;
    List<Bookings> allBookings() throws RemoteException ;
    List<Flights> find(String origin_airport, String destination_airport) throws RemoteException;
}
