package gui;

/*
type of Layout
1. Null Layout - when the component position def by us.
2. Border Layout - top, down, left, right
3. Flow Layout - Arrenge the compenet automatically
4. Grid Layout - Matrix
5. GridBag Layout - like grid + resizeble it self
6. Group Layout - arrenge group wise
7. Box Layout - Box type
8. Card Layout - one at a time
*/


import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("FLow Layout");
        jf.setBounds(100,100,1200,800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=jf.getContentPane();
        c.setLayout(null);

        JButton btn1=new JButton("Button 1 ");
        JButton btn2=new JButton("Button 2 ");
        JButton btn3=new JButton("Button 3 ");
        JButton btn4=new JButton("Button 4");
        JButton btn5=new JButton("Button 5 ");
        JButton btn6=new JButton("Button 6 ");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);

//FlowLayout fl=new FlowLayout(FlowLayout.CENTER,20,50);
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
        fl.setHgap(50);
        fl.setVgap(50);
        c.setLayout(fl);
        jf.setVisible(true);
    }
}