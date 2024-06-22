/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Admin;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author HP
 */
public interface AdminService extends Remote {
    Admin addAdmin (Admin adminobj) throws RemoteException;
    List<Admin> alladmin() throws RemoteException;
    
}
