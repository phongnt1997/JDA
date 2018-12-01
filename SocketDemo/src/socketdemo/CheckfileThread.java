/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author PhongNTSE1997
 */
public class CheckfileThread extends Thread {

    Socket fileSoc;
    Socket socket;
    BufferedReader bf;

    public CheckfileThread(Socket fileSoc, BufferedReader bf) {
        this.fileSoc = fileSoc;

        this.bf = bf;

    }

    public void run() {
        String filename;
        while (true) {
            try {
                if ((filename = bf.readLine()) != null && !filename.contains("!<~endfile~>!")) {
                    filename = "d:/" + filename;
                    int x = JOptionPane.showConfirmDialog(null, "Download?", "You receive a file!!", JOptionPane.YES_NO_OPTION);
                    if (x == JOptionPane.YES_OPTION) {
                        FileWriter fw = new FileWriter(filename);
                        PrintWriter pw = new PrintWriter(fw);

                        String content="";
                        String cur;
                        while ((cur = bf.readLine()) !=null && !cur.contains("!<~endfile~>!")) {
                            content += cur + "\n"; 
                        }
                        StringTokenizer stk = new StringTokenizer(content, "\n");
                        String s;
                        while(stk.hasMoreTokens()) {
                            s = stk.nextToken();
                            pw.println(s);
                        }
                        
                        
                        pw.close();
                        fw.close();
                    }
                    else {
                        String clr;
                       while ((clr = bf.readLine()) !=null && !clr.contains("!<~endfile~>!")) {
                            
                        }
                    }
                }

            } catch (Exception ex) {

            }

        }
    }
}
