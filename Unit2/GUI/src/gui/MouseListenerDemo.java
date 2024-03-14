package gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

//Mouse Listener  is the interface
//MouseEntered ~~ method
//MouseExit ~~ method
//MousePressed `` method
//MouseClicked `` method
//MouseReleased `` method
//addMouseListener
public class MouseListenerDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Mouse Event Handling");
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);
        Font f = new Font("Helvetica",Font.BOLD, 24);

        JTextArea ta = new JTextArea();
        ta.setBounds(0,0, 300, 300);
        ta.setFont(f);
        c.add(ta);
        JLabel l = new JLabel("Mouse Area");
        l.setBounds(350, 350, 200, 200);
        l.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l.setFont(f);
        l.setOpaque(true);
        c.add(l);
        l.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                ta.setText(ta.getText() + "\n Mouse clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ta.setText(ta.getText() + "\n Mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ta.setText(ta.getText() + "\n Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l.setBackground(Color.BLUE);
                ta.setText(ta.getText() + "\n Mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l.setBackground(null);
                ta.setText(ta.getText() + "\n Mouse exit");
            }

        });


        jf.setVisible(true);



    }

}
