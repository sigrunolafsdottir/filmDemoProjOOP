package sprint3.swingDemo.components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;


public class TextAreaDemo extends JFrame implements ActionListener  {
    
   private JPanel p = new JPanel();
   private JPanel buttonPanel = new JPanel();
   private JTextArea area  = new JTextArea(10,60);
   private JScrollPane jsp = new JScrollPane(area);
   private JButton doubleButton = new JButton("Double");
   private JButton clearButton = new JButton("Clear");

   
   public TextAreaDemo() throws IOException {
     area.setFont(new Font("Monospaced", Font.PLAIN, 12)); 
     p.setLayout(new BorderLayout());
     p.add(jsp, BorderLayout.CENTER);
     buttonPanel.add(doubleButton); 
     buttonPanel.add(clearButton); 
     p.add(buttonPanel, BorderLayout.SOUTH);
     area.setLineWrap(true);
     add(p);

     doubleButton.addActionListener(this);
     clearButton.addActionListener(this);

     area.read(new FileReader("src/sprint3/springDemo/components/text.txt"), null);

     pack(); 
     setVisible(true); 
     setDefaultCloseOperation(EXIT_ON_CLOSE);  
   } 
    
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == clearButton){
            area.setText("");
        }
        else if(e.getSource() == doubleButton){
            String newText = area.getText() + area.getText();
            area.setText(newText);
        }
    } 
    
    public static void main (String[] arg) throws IOException {
     TextAreaDemo t = new TextAreaDemo(); 
   } 
}
