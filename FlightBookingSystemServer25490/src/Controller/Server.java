/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Implementation.AdminImplementation;
import Implementation.BookingsImplementation;
import Implementation.FlightsImplementation;
import Implementation.PassangersImplementation;
import Implementation.PaymentsImplementation;
import Implementation.PricesImplementation;
import Implementation.SeatsImplementation;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author HP
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostame","127.0.0.1");
            Registry thereg = LocateRegistry.createRegistry(6000);
            thereg.rebind("Flights" , new FlightsImplementation());
            thereg.rebind("Bookings",new BookingsImplementation());
            thereg.rebind("Passangers",new PassangersImplementation());
            thereg.rebind("Admin", new AdminImplementation());
           
            
            System.out.println(" server is running on port 6000");
        } catch (Exception e) {
        }
    }
}
