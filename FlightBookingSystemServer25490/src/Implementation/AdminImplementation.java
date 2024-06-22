/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.AdminDao;
import Model.Admin;
import Service.AdminService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author HP
 */
public class AdminImplementation  extends UnicastRemoteObject implements AdminService {
         AdminDao dao = new AdminDao();

    public AdminImplementation() throws Exception {
    }
         
    @Override
    public Admin addAdmin(Admin adminobj) throws RemoteException {
        return dao.addAdmin(adminobj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Admin> alladmin() throws RemoteException {
        return dao.alladmin(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
