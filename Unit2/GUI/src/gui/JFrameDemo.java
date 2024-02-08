package gui;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public static void main(String[] args) {
//        JFrame jf=new JFrame();
        JFrame jf=new JFrame("Shivam Panel");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

//        jf.setSize(900,500);
//        jf.setLocation(280,200);

        //or

        jf.setBounds(280,200,900,500);
//        jf.setTitle("Shivam Panel");

        ImageIcon icon=new ImageIcon("resources/sb1.jpeg");
        jf.setIconImage(icon.getImage());

        Container container=jf.getContentPane();
        container.setBackground(Color.BLUE);

        jf.setResizable(false);

    }
}
