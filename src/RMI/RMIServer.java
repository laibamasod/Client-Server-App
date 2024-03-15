package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            MessageProcessor server = new MessageProcessorImpl();
            LocateRegistry.createRegistry(2020);
            Naming.rebind("//localhost:2020/messageprocessor", server);
            System.out.println("RMI Server is running on port 2020...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

