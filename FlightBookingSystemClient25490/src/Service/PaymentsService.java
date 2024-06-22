/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Payments;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface PaymentsService extends Remote {
   
        Payments createPayments(Payments paymentobj) throws RemoteException;
        Payments updatePayments(Payments paymentobj) throws RemoteException;
        Payments deletePayments(Payments paymentobj) throws RemoteException;
        Payments findPayments(Payments paymentobj) throws RemoteException;
        List<Payments> allpayment() throws RemoteException;
    
}
