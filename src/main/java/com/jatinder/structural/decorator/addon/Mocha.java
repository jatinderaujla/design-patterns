package com.jatinder.structural.decorator.addon;

import com.jatinder.structural.decorator.Beverage;

public class Mocha implements Beverage {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getPrice() {
        return 10 + beverage.getPrice();
    }
}
