package com.company.simple;

public class Pen {
    private Colors color;

    public Pen(Colors color) { // Инициализирующий конструктор
        this.color = color;
    }


    public Colors getColor() {
        return color;
    }
}
