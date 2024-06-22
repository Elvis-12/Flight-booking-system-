/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Flights;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface FlightsService  extends Remote{
    Flights createFlights(Flights flightobj) throws RemoteException;
    Flights updateFlights(Flights flightobj) throws RemoteException;
    Flights deleteFlights(Flights flightobj) throws RemoteException;
    Flights findFlights(Flights flightobj) throws RemoteException;
    List<Flights> allFlights() throws RemoteException;
}
