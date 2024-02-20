package gui;

import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Shivam Panel");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(280,200,900,500);

        Font font=new Font("Verdana",Font.ITALIC,17);

        Container container=jf.getContentPane();
        container.setLayout(null);

        JRadioButton male=new JRadioButton("Male");
        male.setBounds(100,100,200,50);
        male.setFont(font);
        male.setSelected(true);
        container.add(male);

        JRadioButton female=new JRadioButton("Female");
        female.setBounds(300,100,200,50);
        female.setFont(font);
        container.add(female);

        ButtonGroup gender=new ButtonGroup();

        gender.add(male);
        gender.add(female);

        JRadioButton gen=new JRadioButton("Genaral");
        gen.setBounds(10,200,200,50);
        gen.setFont(font);
        gen.setSelected(true);
        container.add(gen);

        JRadioButton obc=new JRadioButton("OBC");
        obc.setBounds(210,200,200,50);
        obc.setFont(font);
        container.add(obc);

        JRadioButton sc=new JRadioButton("SC");
        sc.setBounds(410,200,200,50);
        sc.setFont(font);
        sc.setSelected(true);
        container.add(sc);

        JRadioButton st=new JRadioButton("ST");
        st.setBounds(610,200,200,50);
        st.setFont(font);
        container.add(st);

        JRadioButton other=new JRadioButton("Other");
        other.setBounds(810,200,200,50);
        other.setFont(font);
        other.setSelected(true);
        container.add(other);

        ButtonGroup caste=new ButtonGroup();

        caste.add(gen);
        caste.add(obc);
        caste.add(sc);
        caste.add(st);
        caste.add(other);

        jf.setVisible(true);
    }
}
