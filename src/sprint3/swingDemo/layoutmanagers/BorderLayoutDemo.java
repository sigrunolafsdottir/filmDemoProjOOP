package sprint3.swingDemo.layoutmanagers;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    JPanel jp = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JLabel jl = new JLabel("hej");
    JLabel jl2 = new JLabel("ankeborg");
    JLabel jl3 = new JLabel("stockholm");
    JButton jb = new JButton("knapp");
    JButton jb2 = new JButton("tryck här");

    JButton jb3 = new JButton("norr");
    JButton jb4 = new JButton("sken");

    public BorderLayoutDemo(){

        this.add(jp);
        jp.setLayout(new BorderLayout());

        jp.add(southPanel, BorderLayout.SOUTH);
        jp.add(westPanel, BorderLayout.WEST);
        jp.add(northPanel, BorderLayout.NORTH);

        southPanel.setLayout(new FlowLayout());
        westPanel.setLayout(new GridLayout(3,1));

        southPanel.add(jb);
        southPanel.add(jb2);

        westPanel.add(jl);
        westPanel.add(jl2);
        westPanel.add(jl3);

        northPanel.add(jb3);
        northPanel.add(jb4);

        pack();
       // setSize(100, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        BorderLayoutDemo jfd = new BorderLayoutDemo();
    }
}
