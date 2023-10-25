package com.jatinder.structural.decorator.addon;

import com.jatinder.structural.decorator.Beverage;

public class Whip implements Beverage {
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getPrice() {
        return 5 + beverage.getPrice();
    }
}
