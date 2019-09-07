package com.hz;

import discount.Calculator;

public class Main {

    public static void main(String[] args) {

        boolean isAfterEight = false;
        boolean isFriday = true;
        boolean isMonday = true;

        Product butter = new Butter(1);
        Product appleSyrup = new AppleSyrup(2);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(butter);
        cart.addToCart(appleSyrup);

        Calculator calc = new Calculator();

        double discount = calc.getTotalDiscount(cart);

        System.out.println("Total discount:" + discount);
    }
}
