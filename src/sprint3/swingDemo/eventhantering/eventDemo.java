package sprint3.swingDemo.eventhantering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventDemo extends JFrame implements ActionListener {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel("hejsan svejsan");
    JButton jb = new JButton("knappelikanpp");

    JButton jb2 = new JButton("en annan knapp");

    public eventDemo(){

        this.add(jp);
        jp.add(jb);
        jp.add(jb2);
        jp.add(jl);

        jb.addActionListener(this);
        jb2.addActionListener(this);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb){
            jl.setText("button 1 pressed");
        }
        else{
            jl.setText("button 2 pressed");
        }
    }

    public static void main(String[] args){
        eventDemo jfd = new eventDemo();
    }


}
