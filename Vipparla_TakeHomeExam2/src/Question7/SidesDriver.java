/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Arrays;

/**
 *
 * @author S540791
 */
public class SidesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Printing Sides Enum ");
        for(Sides s:Sides.values()){
            System.out.println(s);
            System.out.println("Small Sides Price: $"+s.getSmallSidesPrice());
            System.out.println("Family Sides Price: $"+s.getLargeSidesPrice());
        }
        System.out.println("Printing Cheese Enum");
        for(Sides.Cheese c:Sides.Cheese.values()){
            System.out.println(c);
            System.out.println(" price :"+c.getCheesePrice());
        }
    }
    
}
