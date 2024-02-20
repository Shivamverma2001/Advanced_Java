package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CheckBoxDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Check Box");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(280,200,900,500);

        Font font=new Font("Verdana",Font.ITALIC,17);

        Container container=jf.getContentPane();
        container.setLayout(null);

        JCheckBox apple=new JCheckBox("Apple 80");
        apple.setBounds(10,100,200,50);
        apple.setFont(font);
        container.add(apple);

        JCheckBox banana=new JCheckBox("Banana 40");
        banana.setBounds(210,100,200,50);
        banana.setFont(font);
        container.add(banana);

        JCheckBox graphes=new JCheckBox("Graphes 90");
        graphes.setBounds(410,100,200,50);
        graphes.setFont(font);
        container.add(graphes);

        JCheckBox orange=new JCheckBox("Orange 35");
        orange.setBounds(610,100,200,50);
        orange.setFont(font);
        container.add(orange);

        JButton cal=new JButton("Bill");
        cal.setBounds(200,200,200,50);
        cal.setFont(font);
        container.add(cal);

        JLabel b=new JLabel("Your bill is: ");
        b.setBounds(200,300,200,200);
        b.setFont(font);
        container.add(b);
        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum=0;
                if(apple.isSelected()){
                    sum +=Integer.parseInt(apple.getText().split(" ")[1]);
                }
                if(banana.isSelected()){
                    sum +=Integer.parseInt(banana.getText().split(" ")[1]);
                }
                if(graphes.isSelected()){
                    sum +=Integer.parseInt(graphes.getText().split(" ")[1]);
                }
                if(orange.isSelected()){
                    sum +=Integer.parseInt(orange.getText().split(" ")[1]);
                }
                b.setText("Your bill is: " + sum+"Rs");
            }
        });

        jf.setVisible(true);
    }
}