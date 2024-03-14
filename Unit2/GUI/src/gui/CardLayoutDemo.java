package gui;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Card Layout");

        jf.setBounds(100,100,900,600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=jf.getContentPane();
        CardLayout crd=new CardLayout();

        c.setLayout(crd);

        JButton b1=new JButton("Page 1");
        JButton b2=new JButton("Page 2");
        JButton b3=new JButton("Page 3");
        JButton b4=new JButton("Page 4");
        JButton b5=new JButton("Page 5");
        JButton b6=new JButton("Page 6");

        c.add(b1,"1");//for index
        c.add(b2,"2");
        c.add(b3,"3");
        c.add(b4,"4");
        c.add(b5,"%");
        c.add(b6,"6");

        crd.last(c);  //show last card
        crd.previous(c);
        crd.first(c);
        crd.next(c);
        crd.show(c,"3");

        jf.setVisible(true);
    }
}
