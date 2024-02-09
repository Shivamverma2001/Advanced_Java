package gui;

import javax.swing.*;
import java.awt.*;

public class MyButton {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Button Demo");

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100,100,900,600);

        Container container=jFrame.getContentPane();
        container.setLayout(null);

        JButton button=new JButton("Submit");

        button.setBounds(100,100,200,90);
        button.setFont(new Font("Arial",Font.ITALIC,12));

        button.setBackground(Color.BLACK);
        button.setForeground(Color.blue);

        // WAIT_CURSOR, HAND_CURSOR, ....
        Cursor cursor=new Cursor(Cursor.WAIT_CURSOR);
        button.setCursor(cursor);

        //set enabled true if you want to enable the button
        //button.setEnabled(false);
        button.setIcon(new ImageIcon("resources/sb1.jpeg"));

        container.add(button);

        jFrame.setVisible(true);
    }
}
