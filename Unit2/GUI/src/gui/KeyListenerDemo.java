package gui;
/*
* 1. keyListener
* 2. keyPressed
* 3. keyTyped
* 4. keyReleased
* 5. addKeyListener
* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame4 extends JFrame implements KeyListener {
    JTextArea textArea;
    MyFrame4(){
        setTitle("Key Event Handling");
        setBounds(100,100,900,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container=getContentPane();
        container.setLayout(null);

        textArea=new JTextArea();
        textArea.setBounds(10,10,600,500);
        container.add(textArea);
        textArea.addKeyListener(this);

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        textArea.setText(textArea.getText()+"key typed"+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        textArea.setText(textArea.getText()+"Key Pressed....");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textArea.setText(textArea.getText()+"key released");
    }
}
public class KeyListenerDemo {
    public static void main(String[] args) {
        MyFrame4 m=new MyFrame4();
    }
}
