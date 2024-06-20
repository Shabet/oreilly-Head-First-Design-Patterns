package section02.observer.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExampleV3 {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExampleV3 example = new SwingObserverExampleV3();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println("Come on, dot it!"));

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }


}
