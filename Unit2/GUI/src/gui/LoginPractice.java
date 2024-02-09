package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPractice {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Login Form");

        jFrame.setBounds(100,100,900,700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(null);

        Container container=jFrame.getContentPane();
        Font font=new Font("Arial",Font.ITALIC,19);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(10,10,150,60);
        name.setFont(font);

        JLabel password=new JLabel("Enter Your Password");
        password.setBounds(10,80,150,60);
        password.setFont(font);

        JTextField enterName=new JTextField("Name");
        enterName.setBounds(200,10,150,60);
        enterName.setFont(font);

        JTextField enterPassword=new JTextField("Password");
        enterPassword.setBounds(200,80,150,60);
        enterPassword.setFont(font);

        JButton submit=new JButton("Submit");
        submit.setBounds(200,200,150,60);
        submit.setFont(font);

        JLabel ans=new JLabel("Your detail is: ");
        ans.setBounds(150,150,300,60);
        ans.setFont(font);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String detailText = "Your detail is: " + enterName.getText() + " " + enterPassword.getText();
                ans.setText(detailText);
            }
        });

        container.add(name);
        container.add(password);
        container.add(enterName);
        container.add(enterPassword);
        container.add(submit);
        container.add(ans);

        jFrame.setVisible(true);
    }
}
