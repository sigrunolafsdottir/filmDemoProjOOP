package sprint3.springDemo.eventhantering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventDemoOtherClassEventHandling extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("hejsan svejsan");
    JButton jb = new JButton("knappelikanpp");

    JButton jb2 = new JButton("en annan knapp");

    public eventDemoOtherClassEventHandling(){

        this.add(jp);
        jp.add(jb);
        jp.add(jb2);
        jp.add(jl);

        jb.addActionListener(new OurActionListener(jl, jb, jb2));
        jb2.addActionListener(new OurActionListener(jl, jb, jb2));

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    public static void main(String[] args){
        eventDemoOtherClassEventHandling jfd = new eventDemoOtherClassEventHandling();
    }


}
