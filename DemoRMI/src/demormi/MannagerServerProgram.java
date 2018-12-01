/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author PhongNTSE1997
 */
public class MannagerServerProgram {
    public static void main(String[] args) {
        String serviceName = "rmi://localhost:1089/EmployeeService";
//        String serviceName = "127.0.0.1/EmployeeService";
        String fileName = "employees1.txt";
        EmployeeServer server = null;
        try {
            server = new EmployeeServer(fileName);
            LocateRegistry.createRegistry(1089);
            Runtime rt = Runtime.getRuntime();
            rt.exec("rmiregistry.exe");
            Naming.rebind(serviceName, server);
            System.out.println("Service " + serviceName + " is running.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
