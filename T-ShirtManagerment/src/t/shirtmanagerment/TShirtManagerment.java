/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t.shirtmanagerment;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author PhongNTSE1997
 */
public class TShirtManagerment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String serviceName = "rmi://localhost:1098/TsShop";
        String filename = "fashion.txt";
        try {
            TsServer server = new TsServer(filename);
            LocateRegistry.createRegistry(1098);
            Naming.rebind(serviceName, server);
            System.out.println("server is running");
        } catch (Exception e) {
        }
        
        
    }
    
}
