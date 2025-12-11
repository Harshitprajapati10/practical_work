// creating first swing application


import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        JFrame frame = new JFrame("Swing Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater( // event dispatch thread(to avoid deadlock)
            new Runnable() {
                public void run() {
                    new SwingDemo();
                }
            }
        );
    }
}
