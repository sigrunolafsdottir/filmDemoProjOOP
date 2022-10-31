package sprint3.swingDemo.innerClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymosClassDemo extends JFrame {

    JPanel jp = new JPanel();
    JButton jb = new JButton("Tryck här");


    public AnonymosClassDemo(){
        add(jp);
        jp.add(jb);
        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("knapptryckning");
            }
        });

        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        AnonymosClassDemo jfd = new AnonymosClassDemo();
    }
}
