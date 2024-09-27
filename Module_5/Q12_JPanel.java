import javax.swing.*;

public class Q12_JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        frame.add(panel);  // adding panel to frame
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}