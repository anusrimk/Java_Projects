package Daily_Practice_Java;


// import java.awt.event.*;
// import javax.swing.*;

// public class SwingEventEx2 {
//     public static void main(String[] args) {
//         JFrame f = new JFrame("Swing Event Example");
//         f.setSize(400, 300);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         f.setLayout(null);

//         // Create and position the button
//         JButton b = new JButton("Click Me");
//         b.setBounds(100, 100, 100, 30);
//         f.add(b);

//         // Create and position the label
//         JLabel jl = new JLabel("Sum : ");
//         jl.setBounds(100, 150, 100, 30); // set the position of the label
//         f.add(jl);

//         // Add the action listener to the button
//         b.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 String num = "4";
//                 jl.setText("Sum : " + num);
//             }
//         });

//         // Set the frame visible
//         f.setVisible(true);
//     }
// }


import java.awt.event.*;
import javax.swing.*;

public class SwingEventEx2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Event Example");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 50, 80, 30);
        f.add(tf1);

        JTextField tf2 = new JTextField();
        tf2.setBounds(200, 50, 80, 30);
        f.add(tf2);

        JButton sumButton = new JButton("Sum");
        sumButton.setBounds(100, 100, 80, 30);
        f.add(sumButton);

        JButton subtractButton = new JButton("Subtract");
        subtractButton.setBounds(200, 100, 100, 30);
        f.add(subtractButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(150, 200, 80, 30);
        f.add(resetButton);

        JLabel jl = new JLabel("Result:");
        jl.setBounds(100, 150, 200, 30);
        f.add(jl);

        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int sum = num1 + num2;
                    jl.setText("Sum: " + sum);
                } catch (NumberFormatException ex) {
                    jl.setText("Please enter valid numbers!");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int difference = num1 - num2;
                    jl.setText("Difference: " + difference);
                } catch (NumberFormatException ex) {
                    jl.setText("Please enter valid numbers!");
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                jl.setText("Result:");
            }
        });

        f.setVisible(true);
    }
}