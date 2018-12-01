/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author PhongNTSE1997
 */
public class OutputThread extends Thread {

    Socket socket;
    Socket fileSocket;
    JTextArea txt;
    BufferedReader br;
    BufferedReader bf;
    
    String sender;
    String receiver;
    CheckfileThread chec;
    public OutputThread(Socket socket, Socket fileSocket, JTextArea txt, String sender, String receiver) {
        super();
        this.socket = socket;
        this.fileSocket =fileSocket;
        this.txt = txt;
        this.sender = sender;
        this.receiver = receiver;
        try {
            br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            bf = new BufferedReader(new InputStreamReader(this.fileSocket.getInputStream()));
            chec = new  CheckfileThread(fileSocket, bf);
            chec.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Network Error!");
            System.exit(0);
        }
    }

    public void run() {
        while (true) {
            try {
                if (socket != null) {
                    String msg = "";
                    String content ="";
                    if ((msg = br.readLine()) != null && msg.length() > 0) {
                        txt.append("\n" + receiver + ": " + msg);
                        
                    }
                   
                }
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
