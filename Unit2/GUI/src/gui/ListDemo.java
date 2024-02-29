package gui;

import javax.swing.*;
import java.awt.*;

class MyList extends JFrame
{
    String values[]= {"one","two","three","four", "Five","Six","Seven","Eight", "Nine","Ten"};
    MyList()
    {
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JList list=new JList(values);
        list.setFont(new Font("Arial",Font.BOLD,34));
        list.setVisibleRowCount(4);
        JPanel jp=new JPanel();
        jp.add(new JScrollPane(list));
        add(jp);
        revalidate();
    }
}
public class ListDemo {
    public static void main(String[] args) {
        new MyList();
    }


}