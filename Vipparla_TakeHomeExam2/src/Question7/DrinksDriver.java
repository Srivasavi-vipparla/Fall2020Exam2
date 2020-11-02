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
public class DrinksDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (Drinks drink : Drinks.values()) {
            System.out.print("Drink: " + drink + ": ");

            if (drink.getCost() < 5) {
                System.out.println("normal cost :"+drink.getCost());
            } else {
                System.out.println("costly :"+drink.getCost());
            }

        }
        Drinks d;
        d = Drinks.valueOf("PEPSI");
        System.out.print(d + ":");
        System.out.println(d.getCost());
    }
}
