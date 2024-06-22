/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.PassangersDao;

import Model.Passangers;
import Service.PassangersService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author HP
 */
public class PassangersImplementation  extends UnicastRemoteObject implements PassangersService{
    PassangersDao dao = new PassangersDao();

    public PassangersImplementation()  throws Exception{
    }
    
    @Override
    public Passangers createPassangers(Passangers passangerobj) throws RemoteException {
        return dao.createPassangers(passangerobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Passangers updatePassangers(Passangers passangerobj) throws RemoteException {
        return dao.updatePassangers(passangerobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Passangers deletePassangers(Passangers passangerobj) throws RemoteException {
        return dao.deletePassangers(passangerobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Passangers findPassangers(Passangers passangerobj) throws RemoteException {
        return dao.findPassangers(passangerobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override 
    public List<Passangers> allPassangers() throws RemoteException {
        return dao.allPassangers(); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
