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
        container.setBackground(Color.gray);

        Font font=new Font("Helvetica",Font.ITALIC,10);

        JTextField jTextField=new JTextField();
        jTextField.setBounds(200,200,300,50);

        jTextField.setText("Enter username...");
        jTextField.setFont(font);

        jTextField.setForeground(Color.WHITE);
        jTextField.setBackground(Color.DARK_GRAY);

        jTextField.setEditable(false);// by default true means we can edit it

        container.add(jTextField);

        //Password
        JPasswordField jPasswordField=new JPasswordField();
        jPasswordField.setBounds(200,300,300,50);

        jPasswordField.setText("123456");
        jPasswordField.setFont(font);

        jPasswordField.setForeground(Color.WHITE);
        jPasswordField.setBackground(Color.DARK_GRAY);

        jPasswordField.setEchoChar('#');//to change the type of char
        jPasswordField.setEchoChar((char)0);//if you want to show the password

        container.add(jPasswordField);

        jf.setVisible(true);
    }
}
