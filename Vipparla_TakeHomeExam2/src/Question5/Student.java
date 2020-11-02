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
public class Student extends Person {
// declaring private instance variables
    private char grade;
    //creating a constant variable
    private static final String STUDENTSTATUS = "Graduate";
//parameterized constructor
    public Student(char grade, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }   
//overriding toString() with Student instance variables
    @Override
    public String toString() {
        return "calss name: Student" + "\n" + "Person Name:" + super.getName();
    }
}
