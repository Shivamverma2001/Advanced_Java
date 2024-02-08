package gui;

import javax.swing.*;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Shivam Panel");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setBounds(280,200,900,500);
        Container container=jf.getContentPane();

        ImageIcon img=new ImageIcon("resources/sb1.jpeg");

        container.setLayout(null);
        jf.setVisible(true);

//        JLabel name=new JLabel("User Name: ");
        JLabel label=new JLabel("User Name",img,JLabel.RIGHT);
        label.setBounds(50,50,img.getIconWidth()+200,img.getIconHeight());

        Font f=new Font("Arial",Font.BOLD,24);
        label.setFont(f);


        container.add(label);
    }
}
