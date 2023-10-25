package com.jatinder.structural.flyway;

//Intrinsic (means the common data for majority object creation
public class Bullet {
    private double weight;
    private String shape;
    private String image;

    public Bullet(double weight, String shape, String image) {
        this.weight = weight;
        this.shape = shape;
        this.image = image;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
