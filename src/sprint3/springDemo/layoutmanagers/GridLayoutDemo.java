package sprint3.springDemo.layoutmanagers;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("hej");
    JLabel jl2 = new JLabel("ankeborg");
    JLabel jl3 = new JLabel("stockholm");
    JButton jb = new JButton("knapp");
    JButton jb2 = new JButton("tryck här");

    public GridLayoutDemo(){

        this.add(jp);
        jp.add(jb);
        jp.add(jl);
        jp.add(jb2);
        jp.add(jl2);
        jp.add(jl3);

        jp.setLayout(new GridLayout(3,2));

        pack();
        //setSize(100, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        GridLayoutDemo jfd = new GridLayoutDemo();
    }
}
