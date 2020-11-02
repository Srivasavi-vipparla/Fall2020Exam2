/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.runtime;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person e=new Engineer( "CSE",  "Software Developer",  "Virtusa",  "Sri vasavi",  "Vipparla",  23);
        System.out.println(e.getPersonDetails());
        System.out.println(e.toString());
        Person t=new Teacher("C", "SIUE", 12000, "Dr","Lakshmi", "teja", 29);
        System.out.println(t.getPersonDetails());
        System.out.println(t.toString());
        
    }
    
}
