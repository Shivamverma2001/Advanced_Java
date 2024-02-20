package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Calculator");

        jFrame.setBounds(100,100,900,700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(null);

        Container container=jFrame.getContentPane();
        Font font=new Font("Arial",Font.ITALIC,19);

        JLabel n1=new JLabel("Enter 1st No: ");
        n1.setBounds(10,10,150,60);
        n1.setFont(font);

        JLabel n2=new JLabel("Enter 2nd No");
        n2.setBounds(10,80,150,60);
        n2.setFont(font);

        JTextField enterN1=new JTextField();
        enterN1.setBounds(200,10,150,60);
        enterN1.setFont(font);

        JTextField enterN2=new JTextField();
        enterN2.setBounds(200,80,150,60);
        enterN2.setFont(font);

        JButton sum=new JButton("Addition");
        sum.setBounds(50,200,130,60);
        sum.setFont(font);

        JButton sub=new JButton("Subtraction");
        sub.setBounds(200,200,130,60);
        sub.setFont(font);

        JButton mul=new JButton("Multiplication");
        mul.setBounds(330,200,130,60);
        mul.setFont(font);

        JButton div=new JButton("Division");
        div.setBounds(480,200,130,60);
        div.setFont(font);

        JLabel ans=new JLabel("Calculate your answer" + "");
        ans.setBounds(150,150,300,60);
        ans.setFont(font);

            sum.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int ans1 = Integer.parseInt(enterN1.getText());
                        int ans2 = Integer.parseInt(enterN2.getText());
                        int ans3 = ans1 + ans2;

                        String detailText = "Your detail is: " + ans3;
                        ans.setText(detailText);
                    } catch (NumberFormatException e1) {
                        ans.setText("Please enter numberic value only");
                    }
                }
            });
            sub.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int ans1 = Integer.parseInt(enterN1.getText());
                        int ans2 = Integer.parseInt(enterN2.getText());
                        int ans3 = ans1 - ans2;

                        String detailText = "Your detail is: " + ans3;
                        ans.setText(detailText);
                    }catch (NumberFormatException e1){
                        ans.setText("Please enter numberic value only");
                    }
                }
            });
            mul.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int ans1 = Integer.parseInt(enterN1.getText());
                        int ans2 = Integer.parseInt(enterN2.getText());
                        int ans3 = ans1 * ans2;

                        String detailText = "Your detail is: " + ans3;
                        ans.setText(detailText);
                    }catch(NumberFormatException e1){
                        ans.setText("Please enter numberic value only");
                    }
                }
            });
            div.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        int ans1 = Integer.parseInt(enterN1.getText());
                        int ans2 = Integer.parseInt(enterN2.getText());
                        int ans3 = ans1 / ans2;

                        String detailText = "Your detail is: " + ans3;
                        ans.setText(detailText);
                    } catch (NumberFormatException e1) {
                        ans.setText("Please enter numberic value only");
                    } catch (ArithmeticException e2) {
                        ans.setText("You can't divide a number by 0");
                    }
                }
            });

        container.add(n1);
        container.add(n2);

        container.add(enterN1);
        container.add(enterN2);

        container.add(sum);
        container.add(sub);
        
        container.add(mul);
        container.add(div);

        container.add(ans);

        jFrame.setVisible(true);
    }
}