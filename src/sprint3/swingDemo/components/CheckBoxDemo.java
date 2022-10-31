package sprint3.swingDemo.components;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class CheckBoxDemo extends JFrame implements ActionListener {
   
   private JPanel p = new JPanel(); 
   private JCheckBox red = new JCheckBox("Röd", false);
   private JCheckBox blue = new JCheckBox("Blå", false);
   private JCheckBox yellow = new JCheckBox("Yellow", false);
   private JLabel displayArea = new JLabel(" ");

   public CheckBoxDemo() { 
     p.setLayout(new GridLayout(4,1)); 
     p.add(red); p.add(blue); p.add(yellow); p.add(displayArea);
     add(p);
 
     red.addActionListener(this);  
     blue.addActionListener(this);  
     yellow.addActionListener(this);  
     pack(); 
     setVisible(true); 
     setDefaultCloseOperation(EXIT_ON_CLOSE);  
   } 

   
   public void actionPerformed(ActionEvent e) { 
       
     if (e.getSource() == red){
         red.setBackground(Color.red);
         if (red.isSelected()) {
             displayArea.setText("Du valde rött");
         }
         else{
             displayArea.setText("Du valde INTE rött");
         }
     }
     else if (e.getSource() == blue){
         blue.setBackground(Color.blue);
         displayArea.setText("Du valde blått");
     }
     else if (e.getSource() == yellow){
         yellow.setBackground(Color.yellow);
         displayArea.setText("Du valde gult");
     }
    } 

 
   public static void main (String[] arg) { 
     CheckBoxDemo t = new CheckBoxDemo(); 
   }   
 }

