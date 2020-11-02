/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Staff extends Employee {
// declaring private instance variables
    private String title;
////Inializing instance variables
    public Staff(String title, String office, double salary, String dateHired, String name, String address, String phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.title = title;
    }
   //overriding toString() with Employee instance variables
    @Override
    public String toString() {
        return "calss name: Staff" + "\n" + "Person Name:" + super.getName();
    }
}
