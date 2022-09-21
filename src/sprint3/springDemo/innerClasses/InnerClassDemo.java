package sprint3.springDemo.innerClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassDemo extends JFrame {

    JPanel jp = new JPanel();
    JButton jb = new JButton("Tryck här");

    class InnerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("knapptryckning");
        }
    }

    public InnerClassDemo(){

        add(jp);
        jp.add(jb);
        jb.addActionListener(new InnerClass());

        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        InnerClassDemo jfd = new InnerClassDemo();
    }
}
