package com.company.strings;

public class Strings1 {
    public static void main(String[] args) {
        String s1 = "first", s2 = "second";
        System.out.println(s1.equals(s2));
    }

    static boolean isOnlyDigits(String s){
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))){
                return false;
            }
            else return true;
        }
        return result;
    }
}
