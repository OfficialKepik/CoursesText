package com.company.simple;

public class AnimalsSchool {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.run();
        Squirrel squirrel = new Squirrel();
        squirrel.climb();
    }
}

interface Running { // Printeng, Visible, Coding
    void run();
}

interface Swimming {
    void swim();
}

interface Climbing {
    void climb();
}

class Rabbit extends Animal implements Running, Swimming{

    @Override
    public void run() {
        System.out.println("rabbit runs");
    }

    @Override
    public void swim() {
        System.out.println("rabbit swims");
    }

    @Override
    public void sound() {

    }
}

class Squirrel extends Animal implements Running, Climbing{

    @Override
    public void run() {
        System.out.println("squirrel runs");
    }

    @Override
    public void climb() {
        System.out.println("squirrel climbs");
    }

    @Override
    public void sound() {

    }
}