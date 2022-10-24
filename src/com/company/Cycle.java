package com.company;

import javax.swing.*;
import java.awt.*;

//public static int x = 10;

public class Cycle {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPanel());

    }
}

class DrawPanel extends JPanel{
    public void paintComponent(Graphics graphics){
        for (int i = 0; i < 11; i++) {
            graphics.setColor(Color.GRAY);
            graphics.fillRect(30 + i * 30, 50, 20, 20);
            JLabel jLabel = new JLabel();
            jLabel.setText(String.valueOf(i));
            jLabel.setBounds(32 + i * 30, 50, 20, 20);
            jLabel.setForeground(Color.CYAN);
            this.add(jLabel);
        }
        //graphics.fillRect(x,50,20,20);
    }
}
