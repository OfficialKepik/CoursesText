package com.company;

public class ArraysTask11 {
    public static void main(String[] args) {
        String[] arr = {"It is", "hello world", "main method in the"};
        String s = "It is";
        String[] result = s.split("[ ] + ");
        //System.out.println(result.length);
        for (String str:result)
            System.out.println(str);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] temp = arr[i].split("[ ]+]");
            count+= temp.length;
        }
        System.out.println(count);
    }
}
