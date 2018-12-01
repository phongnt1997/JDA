/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t.shirtmanagerment;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

/**
 *
 * @author PhongNTSE1997
 */
public interface TsInterface extends Remote{
    Vector initdata() throws RemoteException;
    boolean SaveList(Vector data) throws RemoteException;
}
