package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class MyFrame7 extends JFrame implements MouseMotionListener {
    JLabel lb;
    JTextArea ta;
    Container c;
    MyFrame7(){
        setBounds(100,100,900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Mouse Motion");
        c=getContentPane();
        setLocationRelativeTo(null);
        c.setLayout(null);

        lb=new JLabel("Welcome mouse motion");
        lb.setBounds(100,100,500,40);

        Font f=new Font("om",5,20);

        lb.setFont(f);
        c.add(lb);
        lb.addMouseMotionListener(this);

        ta=new JTextArea();
        ta.setBounds(100,160,300,300);
        ta.setFont(f);
        c.add(ta);


        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is moving");
    }
}
public class MouseMotionDemo {
    public static void main(String[] args) {
        MyFrame7 frame7=new MyFrame7();
    }
}
