import javax.swing.*;

public class Q1_JFrameAssn {
    JFrame frame;

    Q1_JFrameAssn() {
        frame = new JFrame(); 
        JButton button = new JButton("Click");
        button.setBounds(130, 100, 100, 40);
        frame.add(button);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Q1_JFrameAssn(); 
    }
}
