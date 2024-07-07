/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author nguyen
 */
public class ServerRMI {
    public static final String UNIQUE_BINDING_NAME="server.calculator";
      public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {
       final RemoteCalculatorServer  server= new RemoteCalculatorServer ();
       final Registry registry= LocateRegistry.createRegistry(2738);
       Remote stub=UnicastRemoteObject.exportObject(server,0);
       registry.bind(UNIQUE_BINDING_NAME, stub);
       Thread.sleep(Integer.MAX_VALUE);
       
    }
    
}
