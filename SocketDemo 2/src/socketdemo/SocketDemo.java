/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

/**
 *
 * @author PhongNTSE1997
 */
public class SocketDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Xinchao ¶ aaa.txt ";
        System.out.println(s.substring(0, s.indexOf("¶")));
        System.out.println(s.substring(s.indexOf("¶")+1));
    }
    
}
