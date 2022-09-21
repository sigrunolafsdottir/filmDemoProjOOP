package sprint3.springDemo.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerAdapterDemo extends JFrame  {

    JPanel jp = new JPanel();
    JButton jb = new JButton("jag är en knapp");

    public MouseListenerAdapterDemo(){

        add(jp);
        jp.add(jb);

        jb.addMouseListener(new MouseAdapterDemo());

        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    public static void main(String[] args){
        MouseListenerAdapterDemo jfd = new MouseListenerAdapterDemo();
    }
}
