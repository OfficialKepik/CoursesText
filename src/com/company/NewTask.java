package com.company;

public class NewTask {
    public static void main(String[] args) {
        long answer = 0;
        int num = 5;
        String s = "";
        for (int i = 0; i < 8; i++) {
            s += String.valueOf(num);
            answer = Long.parseLong(s);
            String left = String.format("%s * %s = ", num, answer);
            System.out.printf("%20s%d\n",left, num * answer);
        }
    }
}
