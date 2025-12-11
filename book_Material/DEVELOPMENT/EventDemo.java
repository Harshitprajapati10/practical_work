// Handle an event in a Swing program.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo {
    JLabel lab;
    EventDemo(){
        JFrame frame = new JFrame("Event Demo");
        frame.setLayout(new FlowLayout()); // set layout manager, doesn't default to FlowLayout
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab = new JLabel("Press the button");
        JButton alpha = new JButton("Alpha");
        JButton beta = new JButton("Beta");
        beta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lab.setText("Beta was Pressed");
            }
        });
        alpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lab.setText("Alpha was Pressed");
            }
        });
        frame.add(alpha);
        frame.add(beta);
        frame.add(lab);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( // event dispatch thread(to avoid deadlock)
            new Runnable() {
                public void run() {
                    new EventDemo();
                }
            }
        );
    }
}
