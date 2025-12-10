
import java.awt.*;
import javax.swing.*;

/**
 * A Swing equivalent of the applet. Compile: javac SimpleAppletSwing.java Run:
 * java SimpleAppletSwing
 */
public class SimpleAppletSwing {

    // A small custom panel that does the actual drawing.
    static class DrawingPanel extends JPanel {

        // Constructor (optional here)
        public DrawingPanel() {
            // set a preferred size so layout managers know how big we want to be
            setPreferredSize(new Dimension(300, 150));
        }

        // paintComponent is the correct place to draw in Swing
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);           // 1) clears the background & prepares the Graphics
            g.drawString("A Simple Applet", 20, 20); // 2) draw the string at (x=20, y=20)
        }
    }

    // Create and show the GUI on the Event Dispatch Thread (EDT)
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {             // 3) schedule GUI creation on EDT(event dispatch thread)
            JFrame frame = new JFrame("Simple Applet"); // 4) top-level window (frame)
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 5) exit program when window closed

            DrawingPanel panel = new DrawingPanel();   // 6) our drawing panel
            frame.getContentPane().add(panel);         // 7) add it to the frame

            frame.pack();                              // 8) size the frame to fit preferred sizes
            frame.setLocationRelativeTo(null);         // 9) center the window on screen
            frame.setVisible(true);                    // 10) show the window
        });
    }
}
