package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxEventDemo {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Login Form");

        jFrame.setBounds(100,100,900,700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(null);

        Container container=jFrame.getContentPane();
        Font font=new Font("Arial",Font.ITALIC,19);

        String []s={"Apple","Banana","orange","tomato","potato"};

        JComboBox cb=new JComboBox(s);
        cb.setFont(font);
        cb.setBounds(10,100,200,50);
        container.add(cb);

        JTextArea ta=new JTextArea(3,10);
        ta.setBounds(250,100,200,200);
        ta.setFont(font);
        container.add(ta);

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                ta.setText(cb.getSelectedItem().toString());
            }
        });

        jFrame.setVisible(true);
    }
}
