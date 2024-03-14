package gui;


import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

class MyFrame6 extends JFrame
{
    JButton b1 = new JButton("Button 1");

    JButton b2 = new JButton("Button 2");

    JButton b3 = new JButton("Button 3");

    JButton b4 = new JButton("Button 4");

    JButton b5 = new JButton("Button 5");

    MyFrame6() {
        setTitle("Grid Layout");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout g = new GridLayout(2,1);
        Container c = getContentPane();
        c.setLayout(g);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4,0);
        c.add(b5);
    }

}
public class GridLayoutDemo {

    public static void main(String[] args) {
        MyFrame6 p = new MyFrame6();

        p.setVisible(true);
    }

}
