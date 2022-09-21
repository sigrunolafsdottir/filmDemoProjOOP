package sprint3.springDemo.components;

import javax.swing.*;
import java.awt.*;

public class ComponentDemo extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("hej");
    JButton jb = new JButton("knapp");

    public ComponentDemo(){

        jb.setBackground(Color.BLUE);
        jl.setText("hopp");
        jb.setText("jag är en knapp");

        this.add(jp);
        jp.add(jb);
        jp.add(jl);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        ComponentDemo jfd = new ComponentDemo();
    }
}
