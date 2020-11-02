/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Triangle extends GeometricObject {
// declaring private instance variables
    private double base, height, width;
//Inializing instance variables
    public Triangle(double base, double height, double width, String color, boolean filled) {
        super(color, filled);
        this.base = base;
        this.height = height;
        this.width = width;
    }
//implenting the abstract methods in GeometircObject class
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    @Override
    public double getPerimeter() {
        return base + height + width;
    }
    //Overriding toString() 
    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + ", width=" + width
                + "\ncolor: " + super.getColor() + " , is Filled:" + super.isFilled();
    }

}
