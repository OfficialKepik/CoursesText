package com.company.methods;

import java.util.Arrays;
import java.util.Objects;

public class Methods2 {
    public static void main(String[] args) {
        System.out.println(isPrime(25));
        for (int elem : calcFactors(24)) {
            if (elem != 0) System.out.println(elem);
        }
        Object[] arr = new Object[5];
        arr[0] = 1;
        arr[1] = "str";
//        for (Object elem : arr) {
//            System.out.println(elem);
//        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(deleteStrings(arr)));
    }

    static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        return result;
    }

    static int[] calcFactors(int number) {
        int[] result = new int[100];
        int index = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result[index++] = i;
            }
        }
        return result;
    }

    //В массиве содержатся строки и целые числа. Вернуть массив, из которого удалены все строки
    static Object[] deleteStrings(Object[] arr) {
        int count = 0;
        for (Object elem : arr)
            if (!Objects.isNull(elem) && !elem.getClass().equals(String.class))
                count++;
        Object[] result = new Object[count];
        int index = 0;
        for (Object elem : arr)
            if (!Objects.isNull(elem) && !elem.getClass().equals(String.class))
                result[index++] = elem;

        return result;
    }
}
