import javax.swing.*;
import java.awt.event.*;

public class Q4_BasicCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton resetButton = new JButton("Reset");
        JLabel result = new JLabel("Result:");

        num1.setBounds(50, 50, 100, 30);
        num2.setBounds(160, 50, 100, 30);
        addButton.setBounds(50, 100, 80, 30);
        subtractButton.setBounds(140, 100, 100, 30);
        resetButton.setBounds(250, 100, 80, 30);
        result.setBounds(50, 150, 200, 30);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    result.setText("Result: " + (n1 + n2));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    result.setText("Result: " + (n1 - n2));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1.setText("");
                num2.setText("");
                result.setText("Result:");
            }
        });

        frame.add(num1);
        frame.add(num2);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(resetButton);
        frame.add(result);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}