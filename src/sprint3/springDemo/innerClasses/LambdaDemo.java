package sprint3.springDemo.innerClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaDemo extends JFrame {

    JPanel jp = new JPanel();
    JButton jb = new JButton("Tryck här");


    public LambdaDemo(){
        add(jp);
        jp.add(jb);
        jb.addActionListener(e -> System.out.println("knapptryckning"));

        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        LambdaDemo jfd = new LambdaDemo();
    }
}
