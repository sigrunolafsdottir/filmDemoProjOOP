package sprint3.swingDemo;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class JFrameDemo2 {

    public JFrameDemo2(){

        JFrame jfr = new JFrame();
        jfr.setSize(200, 100);
        jfr.setVisible(true);
        jfr.setLocationRelativeTo(null);
        jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        JFrameDemo2 jfd = new JFrameDemo2();
    }
}
