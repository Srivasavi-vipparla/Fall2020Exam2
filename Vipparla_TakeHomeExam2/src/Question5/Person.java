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
public class Person {
// declaring private instance variables
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
// parameterized constructor
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
//getter method for name attribute
    public String getName() {
        return name;
    } 
//overriding toString() with Person instance variables
    @Override
    public String toString() {
        return "calss name: Person" + "\n" + "Person Name:" + name;
    }

}
