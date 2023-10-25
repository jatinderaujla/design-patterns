package com.jatinder.structural.decorator;

import com.jatinder.structural.decorator.addon.Mocha;
import com.jatinder.structural.decorator.addon.Whip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorPatternTest {

    @Test
    void decoratorPatternTest(){
        //Espresso with double mocha and whip
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);

        assertEquals(45, espresso.getPrice());

        //Decaf with mocha and double whip
        Beverage decaf = new Decaf();
        decaf = new Mocha(decaf);
        decaf = new Whip(decaf);
        decaf = new Whip(decaf);

        assertEquals(50, decaf.getPrice());
    }
}
