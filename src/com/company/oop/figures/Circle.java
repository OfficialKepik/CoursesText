package com.company.oop.figures;

public class Circle extends Figure {

    private double radius; // Радиус круга

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double length() {
        return 2 * Math.PI * radius;
    }


}
