/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class PizzaTypesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating PizzaTypes enum object and assigning PizzaTypes attribute
        PizzaTypes p=PizzaTypes.HANDTOSSED_PIZZA;
        //calling the toString() with p
        System.out.println(p.toString());
        // comparing values by using ==
       if(p==PizzaTypes.HANDTOSSED_PIZZA){
           System.out.println("using == for HANDTOSSED_PIZZA ");
       }
       //creating PizzaTypes enum object and assigning PizzaTypes attribute
       PizzaTypes pi=PizzaTypes.PAN_PIZZA;
       //comparing values by using equals()
       if(pi.equals(PizzaTypes.PAN_PIZZA)){
           System.out.println(" using equals() for PAN_PIZZA  ");
           
       }
    }
    
}
