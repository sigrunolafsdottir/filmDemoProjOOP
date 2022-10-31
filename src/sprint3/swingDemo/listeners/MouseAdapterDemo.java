package sprint3.swingDemo.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterDemo extends MouseAdapter {


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
    }

}
