package Bac2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 */
public class RemoteCalculatorServer extends UnicastRemoteObject implements Calculator {

    /**
     */
    protected RemoteCalculatorServer() throws RemoteException {
        super();
    }

    @Override
    public String tinh(double a, double b, double c) throws RemoteException {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Phương trình có nghiệm kép: x = " + x;
        } else {
            return "Phương trình vô nghiệm";
        }
    }
}
