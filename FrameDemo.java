import java.awt.*;
import java.awt.event.*;

class FrameDemo extends Frame {

      FrameDemo() {
        setSize(500, 430);  
        setVisible(true);   

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);              }
        });
    }

      public void paint(Graphics g) {
        g.drawString("my first frame", 25, 50);  // Draw text
        g.drawRect(10, 50, 60, 79);  // Draw a rectangle
        g.fillRect(100, 89, 90, 56);  // Draw a filled rectangle
        g.drawOval(300, 200, 50, 50);  // Draw an oval
        g.fillOval(400, 140, 50, 50);  // Draw a filled oval
    }

        public static void main(String args[]) {
        new FrameDemo();  
    }
}


