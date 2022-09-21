package sprint3.springDemo.components;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JTextFieldDemo extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JPanel resultPanel = new JPanel();
    JLabel label = new JLabel("Skriv nåt: ");
    JTextField tf = new JTextField(10);

    JLabel duSkrev = new JLabel("Du skrev: ");
    
    JTextFieldDemo(){
        setLayout(new GridLayout(2,1));
        add(panel);
        panel.add(label);
        panel.add(tf);
        tf.addActionListener(this);
        resultPanel.add(duSkrev);
        this.add(resultPanel);

        pack();
        setSize(300, 300);
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        JTextFieldDemo g = new JTextFieldDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        duSkrev.setText("Du skrev: "+tf.getText());
    }
}
