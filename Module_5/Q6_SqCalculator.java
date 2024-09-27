import javax.swing.*;
import java.awt.event.*;

public class Q6_SqCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Calculator");
        
        JTextField numberField = new JTextField();
        JButton squareButton = new JButton("Square");
        JLabel resultLabel = new JLabel("Result:");
        
        numberField.setBounds(50, 50, 100, 30);
        squareButton.setBounds(160, 50, 100, 30);
        resultLabel.setBounds(50, 100, 200, 30);
        
        squareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(numberField.getText());
                resultLabel.setText("Result: " + (number * number));
            }
        });
        
        frame.add(numberField);
        frame.add(squareButton);
        frame.add(resultLabel);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}