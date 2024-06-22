/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.PricesDao;
import Model.Prices;
import Service.PricesService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author HP
 */
public class PricesImplementation extends UnicastRemoteObject implements PricesService{
    PricesDao dao = new PricesDao();

    public PricesImplementation() throws Exception {
    }

    @Override
    public Prices createPrices(Prices priceobj) throws RemoteException {
        return dao.createprices(priceobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prices updatePrices(Prices priceobj) throws RemoteException {
        return dao.updateprices(priceobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prices deletePrices(Prices priceobj) throws RemoteException {
        return dao.deleteprices(priceobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prices findPrices(Prices priceobj) throws RemoteException {
        return dao.findprices(priceobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Prices> allprice() throws RemoteException {
        return dao.allprices(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
