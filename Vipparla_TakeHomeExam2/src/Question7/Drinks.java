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
public enum Drinks {
    //creating 
    PEPSI(2),
    SPRITE(5),
    MAAZA(7),
    COKE(4),
    COCOCOLA(3),
    THUMBSUP(6);

    private final int cost;

    private Drinks(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
