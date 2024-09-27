//Example of creating a JFrame by creating an instance
package Daily_Practice_Java;
import javax.swing.*;

public class Ex1JFrame {
    public static void main(String[] args) {
        JFrame f=new JFrame();//creating instance of JFrame
        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds (130,100,100, 40);//Setting position of button and size (x axis, y axis, width, height)

        f.add(b);//adding button in JFrame

        f.setSize(400,500);//Setting size of frame 400 width and 500 height 
        f.setLayout (null);//using no layout managers 
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close application on closing frame
    }
    
}
