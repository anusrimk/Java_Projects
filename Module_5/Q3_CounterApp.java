import javax.swing.*;
import java.awt.event.*;

public class Q3_CounterApp {
    private static int count = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter");
        JButton countButton = new JButton("Count");
        JLabel label = new JLabel("Count: " + count);

        countButton.setBounds(100, 100, 100, 40);
        label.setBounds(100, 50, 100, 40);

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Count: " + count);
            }
        });

        frame.add(countButton);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}