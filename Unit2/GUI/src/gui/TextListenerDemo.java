package gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame1 extends JFrame implements ActionListener {
    JTextField ta;
    Container c;


    MyFrame1(){
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);

        ta = new JTextField();
        Font f = new Font("Serif", Font.BOLD, 24);
        ta.setFont(f);
        ta.setBounds(100, 100, 500, 50);
        c.add(ta);
        ta.addActionListener(this);


        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ta.setText(ta.getText().toUpperCase());
    }

}

public class TextListenerDemo{
    public static void main(String[] args) {
        new MyFrame1();

    }
}
