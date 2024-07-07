package Bac2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;

public class ClientMain {
    public static final String UNIQUE_BINDING_NAME = "server.calculator";

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2740);

            // Tìm đối tượng Calculator trong registry
            Calculator calculator = (Calculator) registry.lookup(UNIQUE_BINDING_NAME);

            nhap input = new nhap();
            double[] nhap = input.Input();

            double a = nhap[0];
            double b = nhap[1];
            double c = nhap[2];

            String result = calculator.tinh(a, b, c);
            System.out.println(result);

        } catch (RemoteException | NotBoundException e) {
            System.out.println("Lỗi khi kết nối hoặc gọi phương thức từ server: " + e);
        }
    }
}
