package com.jatinder.structural.flyway;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FlywayPatternTest {

    @Test
    void flywayPatternTest(){
        Bullet bullet = new Bullet(10, "rounded", "round-bullet.png");

        /*
         * Here same kind of bullet is fired in different object so, we are using the same bullet object reference for each fired bullets in different direction
         *** Flyway pattern says segregate the class having Intrinsic and Extrinsic values in it to save memory for same data this helpful when we need large amount of object   ***
         * E.G. In action game we have 1,00,000 bullet object and on an average let 1 bullet object takes 1KB then 1KB * 1,00,000 = 100MB let say,
         * which is very huge amount of space just for bullet objects in action game where we need more data as well.
         * so there we can use this Flyway pattern to save the space by using Intrinsic object as reference
         *
         * Here:- think of Machine gun in action game firing same type of bullet in different direction
         */

        FiredBullet firedInLeftDirection = new FiredBullet("left", "red", bullet);
        FiredBullet firedInRightDirection = new FiredBullet("right", "green", bullet);
        FiredBullet firedInFrontDirection = new FiredBullet("front", "blue", bullet);
        FiredBullet firedInBackDirection = new FiredBullet("back", "yellow", bullet);
        FiredBullet firedInBottomDirection = new FiredBullet("bottom", "yellow", bullet);
        FiredBullet firedInTopDirection = new FiredBullet("top", "green", bullet);

    }
}
