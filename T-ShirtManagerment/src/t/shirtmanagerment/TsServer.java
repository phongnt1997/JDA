/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t.shirtmanagerment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author PhongNTSE1997
 */
public class TsServer extends UnicastRemoteObject implements TsInterface{
    String filename;

    public TsServer(String filename) throws RemoteException {
        super();
        this.filename = filename;
    }

    @Override
    public Vector initdata() throws RemoteException {
        Vector data = new Vector();
        
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            
            while((line = br.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(line, ";");
                Vector v = new Vector();
                v.add(stk.nextToken().trim());
                v.add(stk.nextToken().trim());
                v.add(stk.nextToken().trim());
                v.add(stk.nextToken().trim());
                data.add(v);
            }
            br.close();fr.close();
        } catch (Exception e) {
        }
        return data;
    }

    @Override
    public boolean SaveList(Vector data) throws RemoteException {
        try {
            FileWriter fw = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fw);
            
            for (int i = 0; i < data.size(); i++) {
                Vector v = (Vector)(data.get(i));
                String s = "";
                s = v.get(0) + ";" + v.get(1) + ";" + v.get(2) + ";" + v.get(3);
                pw.println(s);
            }
            pw.close();fw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
