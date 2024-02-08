package gui;

import javax.swing.*;
import java.awt.*;

public class Prac1 {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Lpu");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setBounds(100,100,800,500);

        Container container=jFrame.getContentPane();
        container.setLayout(null);

        Font font=new Font("Arial",2,15);

        jFrame.setIconImage(new ImageIcon("resources/sb1.jpeg").getImage());

        JLabel nameL=new JLabel("Enter your name");
        nameL.setBounds(20,20,150,50);
        nameL.setFont(font);

        JLabel passwordL=new JLabel("Enter your password");
        passwordL.setBounds(20,100,150,50);
        passwordL.setFont(font);

        JTextField name=new JTextField();
        name.setBounds(200,20,150,50);

        name.setFont(font);
        name.setText("Enter your username");

        JPasswordField password=new JPasswordField();
        password.setBounds(200,100,150,50);

        password.setFont(font);
        password.setText("Enter your username");

        container.add(nameL);
        container.add(passwordL);

        container.add(name);
        container.add(password);

        jFrame.setVisible(true);

    }
}
