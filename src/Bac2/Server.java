package Bac2;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 */
public class Server {
    public static final String UNIQUE_BINDING_NAME = "server.calculator";

    public static void main(String[] args) {
        try {
            RemoteCalculatorServer server = new RemoteCalculatorServer();

            
            Registry registry = LocateRegistry.createRegistry(2740);

            registry.bind(UNIQUE_BINDING_NAME, server);

            System.out.println("Server đã sẵn sàng.");

            Thread.sleep(Long.MAX_VALUE);

        } catch (RemoteException | AlreadyBoundException | InterruptedException e) {
            System.out.println("Lỗi khi khởi động server: " + e);
        }
    }
}
