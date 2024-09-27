package Daily_Practice_Java;

import javax.swing.*;
import java.awt.event.*;

public class Ex4_JButtonEv{
    public static void main(String[] args) {
        JFrame j = new JFrame("Application");

        JButton jb = new JButton("Click me");
        JTextField tf = new JTextField();
        
        jb.setBounds(50, 100, 95, 40);
        tf.setBounds(50, 50, 120, 20);

        jb.addActionListener(new ActionListener() { // register a listener with a source (action)
            public void actionPerformed(ActionEvent e) { // performs the source
                jb.setText("Boing");
                tf.setText("Yeehaw");
            }
        });

        j.add(jb);
        j.add(tf);
        j.setSize(400, 300);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
