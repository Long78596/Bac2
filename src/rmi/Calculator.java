/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author nguyen
 */
public interface Calculator extends Remote {
     int multiply(int x, int y) throws RemoteException;
}
