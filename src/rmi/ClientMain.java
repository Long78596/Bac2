/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author nguyen
 */
public class ClientMain {
    public static final String UNIQUE_BINDING_NAME="server.calculator";
      public static void main(String[] args) throws RemoteException,NotBoundException {
      
       final Registry registry= LocateRegistry.getRegistry(2738);
       Calculator calculator=(Calculator)
                registry.lookup(UNIQUE_BINDING_NAME);
       int multiplyResult=calculator.multiply(60,100);
       System.out.println(multiplyResult);
       
       
    }
}
