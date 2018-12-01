/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintapp;

import java.io.*;
class streams {
public static void main(String[] args) {
try {
FileOutputStream fos = new FileOutputStream("serial");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeFloat(3.5);
oos.flush();
oos.close();
}
catch(Exception e) {
System.out.println("Serialization" + e);
System.exit(0);
}
try {
FileInputStream fis = new FileInputStream("serial");
ObjectInputStream ois = new ObjectInputStream(fis);
ois.close();
System.out.println(ois.available()); 
}
catch (Exception e) {
System.out.print("deserialization");
System.exit(0);
}
}
}