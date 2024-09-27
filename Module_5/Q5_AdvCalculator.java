import javax.swing.*;

public class Q5_AdvCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Advanced Calculator");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton modButton = new JButton("%");
        JButton clearButton = new JButton("CLEAR");
        JLabel result = new JLabel("Result:");

        num1.setBounds(50, 50, 100, 30);
        num2.setBounds(160, 50, 100, 30);
        addButton.setBounds(50, 100, 50, 30);
        subtractButton.setBounds(110, 100, 50, 30);
        multiplyButton.setBounds(170, 100, 50, 30);
        divideButton.setBounds(230, 100, 50, 30);
        modButton.setBounds(290, 100, 50, 30);
        clearButton.setBounds(50, 150, 100, 30);
        result.setBounds(50, 200, 200, 30);

        addButton.addActionListener(e -> result.setText("Result: " + (Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText()))));
        subtractButton.addActionListener(e -> result.setText("Result: " + (Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText()))));
        multiplyButton.addActionListener(e -> result.setText("Result: " + (Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText()))));
        divideButton.addActionListener(e -> result.setText("Result: " + (Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText()))));
        modButton.addActionListener(e -> result.setText("Result: " + (Integer.parseInt(num1.getText()) % Integer.parseInt(num2.getText()))));
        clearButton.addActionListener(e -> {
            num1.setText("");
            num2.setText("");
            result.setText("Result:");
        });

        frame.add(num1);
        frame.add(num2);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(modButton);
        frame.add(clearButton);
        frame.add(result);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}