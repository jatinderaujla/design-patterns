package com.jatinder.structural.flyway;

//Extrinsic (value which can change frequently)
public class FiredBullet {
    private String direction;
    private String color;
    private Bullet bullet;

    public FiredBullet(String direction, String color, Bullet bullet) {
        this.direction = direction;
        this.color = color;
        this.bullet = bullet;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
