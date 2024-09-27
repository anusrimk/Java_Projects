//Example of creating a JFrame by Association inside constructor
package Daily_Practice_Java;
import javax.swing.*;

public class Ex2JFrame {

    JFrame f;

    Ex2JFrame(){
        f= new JFrame();//creating instance of JFrame

        JButton b=new JButton("click");//creating instance of JButton 
        b.setBounds (130, 100,100,40); 
        f.add(b);//adding button in JFrame

        f.setSize(400,500);//400 width and 500 height
        f. setLayout (null);//using no layout managers 
        f.setVisible(true);//making the frame visible 
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex2JFrame();
    }
    
}
