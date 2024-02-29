package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracFrame {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Practice");
        jFrame.setBounds(100,100,900,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font=new Font("Arial",2,18);

        Container container=jFrame.getContentPane();
        container.setLayout(null);

        JLabel name=new JLabel("enter your name");
        name.setBounds(10,10,150,50);
        name.setFont(font);
        container.add(name);

        JTextField nameT=new JTextField("Name");
        nameT.setBounds(200,10,200,50);
        nameT.setFont(font);
        container.add(nameT);

        JRadioButton male=new JRadioButton("Male");
        male.setBounds(10,60,100,50);
        male.setFont(font);
        male.setSelected(true);
        container.add(male);

        JRadioButton female=new JRadioButton("Female");
        female.setBounds(200,60,100,50);
        female.setFont(font);
        container.add(female);

        ButtonGroup gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JTextArea address=new JTextArea(10,50);
        address.setBounds(10,120,200,200);
        address.setFont(font);
        container.add(address);

        JCheckBox i1=new JCheckBox("Item 1");
        i1.setBounds(10,400,100,50);
        i1.setFont(font);
        container.add(i1);

        JCheckBox i2=new JCheckBox("Item 2");
        i2.setBounds(200,400,100,50);
        i2.setFont(font);
        container.add(i2);

        JComboBox comboBox=new JComboBox(new String[]{"c1","c2","c3","c4"});
        comboBox.setBounds(10,450,200,50);
        comboBox.setSelectedItem("c2");
        comboBox.setFont(font);
        container.add(comboBox);

        JButton button=new JButton("submit");
        button.setBounds(10,500,150,50);
        button.setFont(font);
        container.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.setBackground(Color.BLUE);
            }
        });

        jFrame.setVisible(true);
    }
}
