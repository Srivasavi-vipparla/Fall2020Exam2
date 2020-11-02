/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating Scanner object
        Scanner s=new Scanner(System.in);
        //declaring base, height,width,color and filled variables
        double base,height,width;
        String color;
        boolean filled;
        //reading triangle sides , color and filled or not
        System.out.println("enter base,height,width of the triangle\n, a color, "+""
                + "and a Boolean value to indicate whether the triangle is filled or not");
        System.out.print("base : ");
        base =s.nextDouble();
        s.nextLine();
        System.out.print("height : ");
        height =s.nextDouble();
        s.nextLine();
        System.out.print("width : ");
        width =s.nextDouble();
        s.nextLine();
        System.out.print("color : ");
        color=s.nextLine();
        System.out.print("is Filled :");
        filled=s.nextBoolean();
        //creating and initializing Triangle object
        Triangle tri=new Triangle(base,height,width,color,filled);
        //invoking getArea() with Triangle object reference
        System.out.println("The area of Triangle is :"+String.format("%.2f",tri.getArea()));
        //invoking getPerimeter() with Triangle object reference
        System.out.println("Perimeter of Triangle is :"+String.format("%.2f",tri.getPerimeter()));
        //invoking getColor() with Triangle object reference
        System.out.println("Color of the Triagle is :"+tri.getColor());
        //invoking isFilled() with Triangle object reference
        System.out.println(" Triangle is filled :"+tri.isFilled());
        //invoking toString() with Triangle object reference
        System.out.println("printing triangle: "+tri.toString());      
        
    }
    
}
