package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame extends JFrame implements ActionListener {
    Container container;
    JButton cyan;
    JButton red;
    JButton yellow;
    JButton gray;
    public MyFrame(){
        container=this.getContentPane();
        container.setLayout(null);

        cyan =new JButton("Cyan");
        cyan.setBounds(100,100,150,60);

        cyan.setFont(new Font("Arial",Font.ITALIC,15));

        red =new JButton("Red");
        red.setBounds(100,200,150,60);

        red.setFont(new Font("Arial",Font.ITALIC,15));

        yellow =new JButton("Yellow");
        yellow.setBounds(100,300,150,60);

        yellow.setFont(new Font("Arial",Font.ITALIC,15));

        gray =new JButton("Gray");
        gray.setBounds(100,400,150,60);

        gray.setFont(new Font("Arial",Font.ITALIC,15));

        container.add(cyan);
        container.add(red);

        container.add(yellow);
        container.add(gray);

        cyan.addActionListener(this);
        red.addActionListener(this);
        yellow.addActionListener(this);
        gray.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cyan) {
            container.setBackground(Color.CYAN);
        } else if (e.getSource() == red) {
            container.setBackground(Color.RED);
        } else if (e.getSource() == yellow) {
            container.setBackground(Color.YELLOW);
        } else if (e.getSource() == gray) {
            container.setBackground(Color.GRAY);
        }
    }
}
public class ButtonAction1 {
    public static void main(String[] args) {
        MyFrame myFrame=new MyFrame();

        myFrame.setTitle("Action on Button");
        myFrame.setBounds(100,100,900,500);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
