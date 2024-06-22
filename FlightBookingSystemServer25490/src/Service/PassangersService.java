/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Flights;
import Model.Passangers;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface PassangersService extends Remote {
    Passangers createPassangers(Passangers passangerobj) throws RemoteException;
    Passangers updatePassangers(Passangers passangerobj) throws RemoteException;
    Passangers deletePassangers(Passangers passangerobj) throws RemoteException;
    Passangers findPassangers(Passangers passangerobj) throws RemoteException;
    List<Passangers> allPassangers() throws RemoteException;
}
