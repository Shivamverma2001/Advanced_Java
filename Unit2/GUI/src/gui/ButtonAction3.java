package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RedClass implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonAction3.container.setBackground(Color.RED);
    }
}
class YellowClass implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonAction3.container.setBackground(Color.YELLOW);
    }
}
class GreenClass implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonAction3.container.setBackground(Color.GREEN);
    }
}
public class ButtonAction3 {
    public static Container container;
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Login Form");

        jFrame.setBounds(100,100,900,700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(null);

        container=jFrame.getContentPane();

        JButton red=new JButton("Red");
        red.setBounds(100,50,100,50);

        JButton yellow=new JButton("Yellow");
        yellow.setBounds(200,50,100,50);

        JButton green=new JButton("Green");
        green.setBounds(300,50,100,50);

        container.add(red);
        container.add(yellow);
        container.add(green);

        red.addActionListener(new RedClass());
        yellow.addActionListener(new YellowClass());
        green.addActionListener(new GreenClass());

        jFrame.setVisible(true);
    }
}
