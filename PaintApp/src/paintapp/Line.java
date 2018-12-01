/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintapp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhongNTSE1997
 */
public class Line {

   public static void main() {
       Date d = new Date();
       SimpleDateFormat s = new SimpleDateFormat(" E K d/M/yy a");
       System.out.println(s.format(d));
   }
    
}
