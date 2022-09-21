package sprint3.springDemo.innerClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LocalClassDemo extends JFrame {

    JPanel jp = new JPanel();
    JButton jb = new JButton("Tryck här");



    public LocalClassDemo(){

        class InnerClass implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("knapptryckning");
            }
        }

        add(jp);
        jp.add(jb);
        jb.addActionListener(new InnerClass());

        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        LocalClassDemo jfd = new LocalClassDemo();
    }
}
