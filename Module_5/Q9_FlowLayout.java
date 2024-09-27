import javax.swing.*;
import java.awt.*;

public class Q9_FlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        frame.setLayout(new FlowLayout());

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
