/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Circle {
    // declaring private instance variables
    private double radius, diameter;
    // //Inializing instance variables
    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
 //overriding toString() with Circle instance variables
    @Override
    public String toString() {
        return "Circle" + "radius=" + radius + ",\ndiameter=" + diameter;
    }

}
