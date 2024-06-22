/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Prices;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface PricesService  extends Remote{
    Prices createPrices(Prices priceobj) throws RemoteException;
    Prices updatePrices(Prices priceobj) throws RemoteException;
    Prices deletePrices(Prices priceobj) throws RemoteException;
    Prices findPrices(Prices priceobj) throws RemoteException;
    List<Prices> allprice() throws RemoteException;
}
