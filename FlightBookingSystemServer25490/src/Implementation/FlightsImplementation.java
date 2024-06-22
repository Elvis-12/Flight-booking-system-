/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.FlightsDao;
import Model.Flights;
import Service.FlightsService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author HP
 */
public class FlightsImplementation extends UnicastRemoteObject implements FlightsService {
   FlightsDao dao = new FlightsDao();

    public FlightsImplementation()  throws Exception{
    }
   
    @Override
    public Flights createFlights(Flights flightobj) throws RemoteException {
        return dao.createFlights(flightobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Flights updateFlights(Flights flightobj) throws RemoteException {
        return dao.updateFlights(flightobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Flights deleteFlights(Flights flightobj) throws RemoteException {
        return dao.deleteFlights(flightobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Flights findFlights(Flights flightobj) throws RemoteException {
        return dao.findFlights(flightobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Flights> allFlights() throws RemoteException {
        return dao.allFlights(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
