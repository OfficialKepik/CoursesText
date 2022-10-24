package com.company;

import java.util.Arrays;

public class TaskClass {
    public static void main(String[] args) {
        int min = 10000000;
        int max = 99999999;
        int count = 0;
        //int[] arr = new int[2_000_000_000];
        for (int i = min; i < max; i++) {
            String s = Integer.toString(i);
            char[] carr = s.toCharArray();
            int[] arr = new int[carr.length];
            for (int j = 0; j < carr.length; j++) {
                arr[j] = Integer.parseInt(String.valueOf(carr[j]));
            }
//            System.out.println(Arrays.toString(arr));
            boolean flag = true;
            for (int j = 0; j < carr.length; j++) {
                for (int k = j+1; k < carr.length; k++) {
                    if(arr[j]==arr[k]){
                        flag = false;
                    }
                }
            }
            if(flag && i%12345==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
