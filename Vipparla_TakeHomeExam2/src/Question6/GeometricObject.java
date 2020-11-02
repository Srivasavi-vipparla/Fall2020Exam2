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
abstract class GeometricObject {
    // declaring private instance variables
   private String color;
   private boolean filled;
//Inializing instance variables
    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.filled = isFilled;
    }
//getter methods for instance variables
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }     
    //defining abstarct methods 
    public abstract double getArea();
    public abstract double getPerimeter();    
}
