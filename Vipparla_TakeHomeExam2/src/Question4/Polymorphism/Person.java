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
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String print() {
        return "print() in Person class";
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }

}
