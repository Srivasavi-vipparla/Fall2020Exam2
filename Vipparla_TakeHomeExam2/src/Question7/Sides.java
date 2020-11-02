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
public enum Sides {

    GARLIC_CHEESEBREAD(6.99, 24.99),
    ONION_RINGS(4.99, 7.49),
    NO_SIDES(0.00, 0.00);
    private final double smallSidesPrice, lardesidesPrice;

    private Sides(double smallSidesPrice, double lardesidesPrice) {
        this.smallSidesPrice = smallSidesPrice;
        this.lardesidesPrice = lardesidesPrice;
    }
    public double getSmallSidesPrice() {
        return smallSidesPrice;
    }
    public double getLargeSidesPrice() {
        return lardesidesPrice;
    }
    public enum Cheese {
        AMERICAN_CHEESE(0.55),
        CHEDDAR_CHEESE(0.60),
        PEPPER_JACK_CHEESE(0.59),
        RANCH(0.60),
        NO_CHEESE(0.0);
        private final double CheesePrice;

        private Cheese(double CheesePrice) {
            this.CheesePrice = CheesePrice;
        }

        public double getCheesePrice() {
            return CheesePrice;
        }

    }

}
