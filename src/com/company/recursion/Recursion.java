package com.company.recursion;

public class Recursion {
    static int sum = 0;

    public static void main(String[] args) {
        //recurse(10);
        //System.out.println(sum2(1));
        System.out.println(factorial(4));
    }

    static void recurse(int count) {
        if (count < 0) {
            return;
        }
        System.out.println("hi : " + count);
        recurse(--count);
        //recurse(++count);
    }

    static void sum(int index) {
        if (index > 5) {
            System.out.println(sum);
            return;
        }
        sum += index;
        sum(++index);
    }

    static int sum2(int index) {
        if (index > 5) return 0;
        return index + sum2(++index);
    }

    static int factorial(int number) {
        if (number == 0 || number == 1) return 1;
        return number*factorial(number-1);
    }
}