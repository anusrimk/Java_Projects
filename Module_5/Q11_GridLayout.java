import javax.swing.*;
import java.awt.*;

public class Q11_GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");

        frame.setLayout(new GridLayout(2, 2)); // 2 rows and 2 columns

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}