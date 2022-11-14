package com.company.constructor;

public class Smartphone {
    private Company company;
    private String model;

    private OS os;
    // Размер экрана
    private double displaySize;
    // Вес
    private double weight;

    public static void setSeller(String seller) {
        Smartphone.seller = seller;
    }

    public String getSeller() {
        return seller;
    }

    // Продавец
    private static String seller;

    public Company getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public OS getOs() {
        return os;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "company=" + company +
                ", model='" + model + '\'' +
                ", os=" + os +
                ", displaySize=" + displaySize +
                ", weight=" + weight +
                '}';
    }

    public Smartphone(Company company, String model, OS os, double displaySize, double weight) {
        this.company = company;
        this.model = model;
        this.os = os;
        this.displaySize = displaySize;
        this.weight = weight;
    }

    public Smartphone(Company company, String model) {
        this.company = company;
        this.model = model;
    }

}

enum Company {Samsung, Apple, Xiaomi, Nokia};

enum OS {Android, IOS, Windows};
