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
public class Faculty extends Employee {
// declaring private instance variables
    private double officeHours;
    private int teachingSubjectsCount;
//parameterized constructor
    public Faculty(double officeHours, int teachingSubjectsCount, String office, double salary, String dateHired, String name, String address, String phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.officeHours = officeHours;
        this.teachingSubjectsCount = teachingSubjectsCount;
    }
 //overriding toString() with Employee instance variables
    @Override
    public String toString() {
        return "calss name: Faculty" + "\n" + "Person Name:" + super.getName();
    }
}
