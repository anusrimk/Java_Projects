import javax.swing.*;

public class Q2_JFrameInhert extends JFrame {
    Q2_JFrameInhert() {
        JButton button = new JButton("Click");
        button.setBounds(130, 100, 100, 40);
        add(button);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Q2_JFrameInhert(); 
    }
}