package com.company.oop.figures;

public class Rectangle {
    private double a;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    private double b; //

    public double area() {
        return a*b;
    }

    public double length() {
        return (a+b)*2;
    }
}
