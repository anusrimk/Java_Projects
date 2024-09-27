import javax.swing.*;
import java.awt.event.*;

public class Q7_GenderSelection {
    public Q7_GenderSelection() {
        JFrame frame = new JFrame("Gender Selection");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);

        maleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected Male");
            }
        });

        femaleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You selected Female");
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(maleButton);
        frame.add(femaleButton);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Q7_GenderSelection();
    }
}