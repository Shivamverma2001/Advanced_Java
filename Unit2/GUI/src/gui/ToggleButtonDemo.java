package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyToggleButton extends JFrame{
    Container container;
    JToggleButton toggleButton;
    MyToggleButton(){
        JFrame jFrame=new JFrame("Toggle Button Demo");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100,100,900,600);

        container=jFrame.getContentPane();
        container.setBackground(Color.white);
        container.setLayout(null);

        toggleButton=new JToggleButton("Dark Mode");
        toggleButton.setBounds(100,100,200,60);
        container.add(toggleButton);

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(toggleButton.isSelected()){
                    container.setBackground(Color.BLACK);
                    toggleButton.setText("Light Mode");
                }else{
                    container.setBackground(Color.WHITE);
                    toggleButton.setText("Dark Mode");
                }

            }
        });

        jFrame.setVisible(true);
    }
}
public class ToggleButtonDemo {
    public static void main(String[] args) {
        MyToggleButton myToggleButton=new MyToggleButton();


    }
}
