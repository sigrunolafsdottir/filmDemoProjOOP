package sprint3.swingDemo.eventhantering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OurActionListener implements ActionListener {

    JLabel l = new JLabel();
    JButton b = new JButton();
    JButton b2 = new JButton();

    public OurActionListener(JLabel l, JButton b1, JButton b2){
        this.l = l;
        this.b = b1;
        this.b2 = b2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b){
            l.setText("knapp 1 har blivit tryckt på");
        }
        else{
            l.setText("knapp 2 har blivit tryckt på");
        }

    }
}
