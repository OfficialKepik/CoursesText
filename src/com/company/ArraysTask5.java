package com.company;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask5 {
    public static void main(String[] args) {
        int n = 10;
        int [] arr= new int[n];
        Random random= new Random();
        for (int i = 0; i < n; i++)
            arr [i] = random.nextInt(21 )-10;
        boolean marks[] = new boolean[n];
        for (int i=0; i<n; i++)
            marks[i] = false;
        System.out.println(Arrays.toString(arr));
        int count=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j])
                    count++;  }
            if (count >0){
                System.out.println(arr[i]+" - "+ count+ (count>1 ?" times":" time") );
                count=0;}
        }
    }
}
