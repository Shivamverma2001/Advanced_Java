package gui;

import javax.swing.*;
import java.awt.*;

public class RegistrationFromDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Registration Form");
        frame.setBounds(100,100,900,600);

        Font font=new Font("Arial",2,18);

        Container container=frame.getContentPane();
        container.setLayout(null);

        JLabel nameL=new JLabel("Name");
        nameL.setBounds(10,40,100,40);
        container.add(nameL);

        JTextField name=new JTextField("Enter your name");
        name.setBounds(200,40,250,40);
        container.add(name);

        JLabel mobL=new JLabel("Mobile No");
        mobL.setBounds(10,100,100,40);
        container.add(mobL);

        JTextField mob=new JTextField("Enter your mobile number");
        mob.setBounds(200,100,250,40);
        container.add(mob);

        JLabel passL=new JLabel("Password");
        passL.setBounds(10,160,100,40);
        container.add(passL);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(200,160,250,40);
        container.add(pass);

        JLabel genL=new JLabel("Gender");
        genL.setBounds(10,220,100,40);
        container.add(genL);

        JRadioButton male=new JRadioButton("Male");
        male.setBounds(200,220,250,40);
        container.add(male);

        JRadioButton female=new JRadioButton("Female");
        female.setBounds(390,220,250,40);
        container.add(female);

        ButtonGroup gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JLabel addL=new JLabel("Address");
        addL.setBounds(10,280,100,40);
        container.add(addL);

        JTextArea address=new JTextArea(5,50);
        address.setBounds(200,280,300,100);
        container.add(address);

        JCheckBox check=new JCheckBox();
        check.setBounds(10,380,20,100);
        container.add(check);

        JLabel checkL=new JLabel("Terms & conditions accepted");
        checkL.setBounds(50,410,250,40);
        container.add(checkL);

        JButton submit=new JButton("Submit");
        submit.setBounds(200,450,150,60);
        container.add(submit);

        if(!check.isSelected()){
            submit.disable();
        }

        frame.setVisible(true);
    }
}
