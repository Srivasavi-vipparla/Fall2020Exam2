/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.Polymorphism;



/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person s = new Student(12345, "sri");
        System.out.println(s.print() + "\n" + s.toString());
        Person e = new Employee(15000, "vasavi");
        System.out.println(e.print() + "\n" + e.toString());
    }

}
