package com.company.simple;

public class SimpleClasses {
    public static void main(String[] args) {
        Pen pen = new Pen(Colors.Yellow);
        System.out.println(pen.getColor());
        Car car = new Car(Colors.Green);
        System.out.println(car.toString());

        Mixer mixer = new Mixer();
        mixer.setValues(5,5);
        System.out.println(mixer.getTemp());
    }
}

class Mixer{ // Functional, informal
    double coldTemp = 15;
    double hotTemp = 60;
    int cold = 0;
    int hot = 0;

    public void setValues(int cold, int hot){
        this.cold = cold;
        this.hot = hot;
    }

    public double getTemp(){
        return (cold*coldTemp+hot*hotTemp)/(cold+hot);
    }
}