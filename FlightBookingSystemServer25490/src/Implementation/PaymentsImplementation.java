/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.PaymentsDao;
import Model.Payments;
import Service.PaymentsService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author HP
 */
public class PaymentsImplementation  extends UnicastRemoteObject implements PaymentsService{
    PaymentsDao dao = new PaymentsDao();

    public PaymentsImplementation() throws Exception{
    }

    @Override
    public Payments createPayments(Payments paymentobj) throws RemoteException {
        return dao.createPayments(paymentobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payments updatePayments(Payments paymentobj) throws RemoteException {
        return dao.updatePayments(paymentobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payments deletePayments(Payments paymentobj) throws RemoteException {
        return dao.deletePayments(paymentobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payments findPayments(Payments paymentobj) throws RemoteException {
        return dao.findPayments(paymentobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payments> allpayment() throws RemoteException {
        return dao.allpayments(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
