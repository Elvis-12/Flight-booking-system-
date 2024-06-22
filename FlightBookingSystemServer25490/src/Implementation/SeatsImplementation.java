/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.SeatsDao;
import Model.Seats;
import Service.SeatsService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author HP
 */
public class SeatsImplementation extends UnicastRemoteObject implements SeatsService{
   SeatsDao dao = new SeatsDao(); 

    public SeatsImplementation() throws Exception {
    }

    @Override
    public Seats createSeats(Seats seatobj) throws RemoteException {
        return dao.createSeats(seatobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seats updateSeats(Seats seatobj) throws RemoteException {
        return dao.updateSeats(seatobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seats deleteSeats(Seats seatobj) throws RemoteException {
        return dao.deleteSeats(seatobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seats findSeats(Seats seatobj) throws RemoteException {
        return dao.findseats(seatobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Seats> allseat() throws RemoteException {
        return dao.allseats(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
