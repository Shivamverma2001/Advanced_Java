package gui;

import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Shivam Panel");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setBounds(280,200,900,500);
        Container container=jf.getContentPane();

        container.setLayout(null);

        Font font=new Font("Helvetica",Font.ITALIC,10);

        JTextField jTextField=new JTextField();
        jTextField.setBounds(200,200,300,50);

        jTextField.setText("Enter username...");
        jTextField.setFont(font);

        container.add(jTextField);
        jf.setVisible(true);
    }
}
