/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.StringTokenizer;
import java.util.Vector;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author Pham Trong Nghia
 */
public class EmployeeServer extends UnicastRemoteObject implements EmployeeMngInterface {
    String fileName;
    public EmployeeServer(String fileName) throws RemoteException {
        super();
        this.fileName = fileName;
    }
    
    @Override
    public Vector getInitialData() throws RemoteException {
        Vector data = new Vector(0);
        try {
            FileReader f = new FileReader(fileName);
            BufferedReader br = new BufferedReader(f);
            String line;
            StringTokenizer stk;
            String code, name; int salary;
            while ((line = br.readLine()) != null) {
                stk = new StringTokenizer(line, ",");
                Vector v = new Vector();
                v.add(stk.nextToken());
                v.add(stk.nextToken());
                v.add(Integer.parseInt(stk.nextToken()));
                data.add(v);
            }
            br.close(); f.close();
        } catch (Exception e) {
        }
        return data;
    }

    @Override
    public boolean saveList(Vector data) throws RemoteException {
        try {
            FileWriter f = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(f);
            for (int i = 0; i < data.size(); i++) {
                Vector v = ((Vector)(data.get(i)));
                String s = "";
                s += v.get(0) + "," + v.get(1) + "," + v.get(2);
                pw.println(s);
            }
            pw.close(); f.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
