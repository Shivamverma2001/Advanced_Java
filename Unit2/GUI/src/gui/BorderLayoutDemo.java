package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        BorderLayout bl = new BorderLayout();
        c.setLayout(bl);

        JButton b1 = new JButton("North");
        c.add(b1, BorderLayout.NORTH);
        JButton b2 = new JButton("South");
        c.add(b2, BorderLayout.SOUTH);
        JButton b3 = new JButton("East");
        c.add(b3, BorderLayout.EAST);
        JButton b4 = new JButton("West");
        c.add(b4, BorderLayout.WEST);
        JButton b5 = new JButton("Center");
        c.add(b5, BorderLayout.CENTER);



        jf.setVisible(true);
    }

}
