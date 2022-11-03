package com.company.oop.figures;

public class Paradigms {
    public static void main(String[] args) {
        // мперативный
        double r1 = 1;
        double r2 = 2;
        double r3 = 3;
        double s1 = Math.PI * r1 * r1;
        double s2 = Math.PI * r2 * r2;
        double s3 = Math.PI * r3 * r3;
        double l1 = 2 * Math.PI * r1;
        double l2 = 2 * Math.PI * r2;
        double l3 = 2 * Math.PI * r3;

        // функциональное
        s1 = areaCircle(r1);

        // ооп
        Circle circle = new Circle();
        for (int i = 0; i < 3; i++) {
            circle.setRadius(i + 1);
            System.out.println(circle.area());
        }

        Rectangle rectangle = new Rectangle();
        rectangle.setA(1);
        rectangle.setB(2);
        System.out.println(rectangle.area());
    }

    static double areaCircle(double r) {
        return Math.PI * r * r;
    }

    static double lengthCircle(double r) {
        return 2 * Math.PI * r;
    }

}

