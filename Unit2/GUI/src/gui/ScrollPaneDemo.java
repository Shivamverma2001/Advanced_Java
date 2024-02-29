package gui;

import javax.swing.*;
import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Scroll Pane");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// jf.setBounds(100,100,800,600);
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new FlowLayout());

        JTextArea jta=new JTextArea(5,5);
        jta.setFont(new Font("Verdana",Font.BOLD,34)); // j j j j jj j j j j j j j j
        JScrollPane jsp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jta.setLineWrap(true);
        jf.add(jsp);

        jf.setVisible(true);
    }
}