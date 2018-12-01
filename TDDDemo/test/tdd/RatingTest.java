/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import tdddemo.Rating;

/**
 *
 * @author PhongNTSE1997
 */
public class RatingTest {
    
    @Test //de chay ham nay, ham chay se test code chinh
    public void testRatingFuntionMethod() {
        assertEquals("Excellence", Rating.rate(10));
        assertEquals("Good", Rating.rate(8));
        assertEquals("Faird", Rating.rate(7));
        assertEquals("Average", Rating.rate(5));
        assertEquals("Tre trau", Rating.rate(4));
        assertEquals("Invalid Grade", Rating.rate(40));
       
    }// day la doan code de test code chinh tuc la test ham rate() cua class
    //dung ham assertEquals()
}
