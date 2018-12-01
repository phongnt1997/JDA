/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdddemo;

/**
 *
 * @author PhongNTSE1997
 */
public class Rating {
    public static String rate(double gpa) {
        if(gpa > 10) return "Invalid Grade";
        if(gpa >= 9) return "Excellence";
        else if(gpa >= 8) return "Good";
        else if(gpa >= 7) return "Faird";
        else if(gpa >= 5) return "Average";
        else if(gpa >= 0)return "Tre trau";
        else return "Invalid Grade";
    }
}
