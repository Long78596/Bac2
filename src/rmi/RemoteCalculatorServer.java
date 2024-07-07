/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;
import java.rmi.RemoteException;
/**
 *
 * @author nguyen
 */
public class RemoteCalculatorServer  implements Calculator{
    @Override
    public int multiply(int x, int y) throws RemoteException{
        return x*y;
    }
}
