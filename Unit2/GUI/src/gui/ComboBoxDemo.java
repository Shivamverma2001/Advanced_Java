package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxDemo {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Combo Box Demo");
        Font font=new Font("Arial",Font.ITALIC,19);
        Container container=jFrame.getContentPane();

        jFrame.setBounds(100,100,900,700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        String menu[]={"Apple","Banana","Graphes"};
        int price[]={80,40,90,100};
        JComboBox jComboBox=new JComboBox(menu);
        jComboBox.addItem("Pizza");
        jComboBox.setBounds(100,400,200,200);
        jComboBox.setFont(font);
        container.add(jComboBox);

        JComboBox<String> comboBox=new JComboBox<>(new String[]{"Male", "Female"});
        comboBox.setBounds(100,100,200,200);
        comboBox.setFont(font);
        container.add(comboBox);

        JButton button=new JButton("Submit");
        button.setBounds(100,300,200,40);
        button.setFont(font);
        container.add(button);

        JLabel b=new JLabel("");
        b.setBounds(300,300,200,200);
        b.setFont(font);
        container.add(b);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setText("");
                //b.setText(comboBox.getSelectedItem().toString());
                b.setText(jComboBox.getSelectedItem().toString());
                b.setText(b.getText()+": Rs."+price[jComboBox.getSelectedIndex()]+"/-");
            }
        });

        jFrame.setVisible(true);
    }
}
