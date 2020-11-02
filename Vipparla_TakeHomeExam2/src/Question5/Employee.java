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
public class Employee extends Person {
// declaring private instance variables
    private String office;
    private double salary;
    private String dateHired;
//parameterized constructor
    public Employee(String office, double salary, String dateHired, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }   
//overriding toString() with Employee instance variables
    @Override
    public String toString() {
        return "calss name: Employee" + "\n" + "Person Name:" + super.getName();
    }
}
