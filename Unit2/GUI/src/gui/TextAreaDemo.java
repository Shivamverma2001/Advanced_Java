package gui;

import javax.swing.*;
import java.awt.*;

public class TextAreaDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Text Area Demo");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,900,600);

        Container container=jf.getContentPane();
        container.setLayout(null);

        Font font=new Font("Arial",Font.ITALIC,18);

        JTextArea textArea=new JTextArea("Please enter your comment here...",10,60);

        textArea.setBounds(100,100,300,200);
        textArea.setFont(font);
        textArea.setLineWrap(true);
        textArea.setEnabled(false);//if you dont want to override text

        container.add(textArea);
        jf.setVisible(true);
    }
}
