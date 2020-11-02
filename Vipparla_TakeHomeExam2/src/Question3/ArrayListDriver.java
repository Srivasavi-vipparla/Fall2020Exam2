/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class ArrayListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating ArrayList lcds with Object type
        ArrayList<Object> lcds = new ArrayList<Object>();
        //creating and initializing Loan object
        Loan l = new Loan(15000, "Chase", "Education", 0.1, 2);
        //Adding Loan object reference to lcds list
        lcds.add(l);
        //creating and initializing date object
        Date d = new Date();
        //Adding Date object reference to lcds list
        lcds.add(d);
        //creating and initializing String object
        String s = new String("I am String Constructor");
        //Adding String object reference to lcds list
        lcds.add(s);
        //creating and initializing Circle object
        Circle c = new Circle(12.3, 4.5);
        ////Adding Circle object reference to lcds list
        lcds.add(c);
        // Invoking all objects by using enhanced for loop
        for (Object obj : lcds) {
            System.out.println(obj.toString());
        }

    }

}
