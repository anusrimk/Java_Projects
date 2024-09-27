//Example of creating a JFrame by Inheritance 
package Daily_Practice_Java;
import javax.swing.*;

public class Ex3JFrame extends JFrame{   // inherting JFrame
    JFrame f;
    Ex3JFrame(){
        // f = new JFrame("My First JFrame");
        JButton b=new JButton("click");//create button
        b. setBounds(130,100,100,40);
        add (b);//adding button on frame

        f.setSize(400,500);//400 width and 500 height
        f. setLayout (null);//using no layout managers 
        f.setVisible(true);//making the frame visible 
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    }

    public static void main(String[] args) {
        new Ex3JFrame();
    }
}
