package sprint3.springDemo;

import javax.swing.*;

public class JFrameDemo extends JFrame {

    public JFrameDemo(){
        setSize(200, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        JFrameDemo jfd = new JFrameDemo();
    }
}
