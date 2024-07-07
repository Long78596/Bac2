package Bac2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    String tinh(double a, double b, double c) throws RemoteException;
}
