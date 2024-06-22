/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Seats;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface SeatsService extends Remote{
    Seats createSeats(Seats seatobj) throws RemoteException;
    Seats updateSeats(Seats seatobj) throws RemoteException;
    Seats deleteSeats(Seats seatobj) throws RemoteException;
    Seats findSeats(Seats seatobj) throws RemoteException;
    List<Seats> allseat() throws RemoteException;
}
