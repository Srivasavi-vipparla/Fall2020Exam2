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
public class Employee extends Person {

    private double salary;

    public Employee(double salary, String name) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String print() {
        return "print() in Employee class";
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + '}';
    }

}
