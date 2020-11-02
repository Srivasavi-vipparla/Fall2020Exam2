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
public class Student extends Person {

    private long id;

    public Student(long id, String name) {
        super(name);
        this.id = id;
    }

    @Override
    public String print() {
        return "print() in Student class";
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + '}';
    }

}
