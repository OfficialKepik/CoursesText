package com.company.methods;

public class ex2 {
    public static void main(String[] args) {

    }

    //Перегрузка методов (overloading)
    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }

    public  static <T extends Number> double sum(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }

    public static int sum(int... args) {
        int result = 0;
        for (int arg : args) {
            result+=arg;
        }
        return result;
    }

    public static String sum(String s1,String s2){
        return s1+s2;
    }
}
