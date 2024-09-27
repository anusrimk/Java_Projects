import javax.swing.*;

public class Q8_CheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Example");
        
        JCheckBox checkbox1 = new JCheckBox("Java");
        JCheckBox checkbox2 = new JCheckBox("C++");
        
        checkbox1.setBounds(100, 50, 100, 30);
        checkbox2.setBounds(100, 100, 100, 30);
        
        checkbox1.addActionListener(e -> {
            if (checkbox1.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Java Selected");
            }
        });
        
        checkbox2.addActionListener(e -> {
            if (checkbox2.isSelected()) {
                JOptionPane.showMessageDialog(frame, "C++ Selected");
            }
        });
        
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}