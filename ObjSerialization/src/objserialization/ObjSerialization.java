/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author PhongNTSE1997
 */
public class ObjSerialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filename = "book.data";
        Book b1 = new Book("bill", "Book about le thi ca chua");
        Book b2 = new Book("b222", "Book about le thi ca chua");
        
        //serialization;
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ArrayList list = new ArrayList();
            list.add(b1);
            list.add(b2);
            
            oos.writeObject(list);
            oos.close();
            fos.close();
    
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList booklist = (ArrayList)ois.readObject();
            for (Object ob : booklist) {
                Book b = (Book)ob;
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
