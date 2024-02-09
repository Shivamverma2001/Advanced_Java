package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction2 {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Action Button 2");

        jFrame.setBounds(100,100,900,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container=jFrame.getContentPane();
        container.setLayout(null);

        JButton button=new JButton("Submit");

        button.setBounds(100,100,200,60);
        button.setFont(new Font("Arial",Font.ITALIC,18));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground(Color.GREEN);
            }
        });

        container.add(button);

        jFrame.setVisible(true);
    }
}
