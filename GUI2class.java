//FRAME WITH CLASS AND FONTS
package Swing;
       
//import javax.swing.*; // IT INCLUDE ALL PACKAGES
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;

   
public class GUI2class {
    public static void main(String[] args) {
         new myFrame();       
    }
}
  
class myFrame extends JFrame{
    JLabel l = new JLabel("LoveExtendsCode");

    public myFrame(){
        super("MY JAVA");
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200, 200);
        setSize(400,300);

        //Change Background Color
        Container c = getContentPane();
        c.setBackground(Color.cyan);
        
        //ReWrites the Jlabel
        l.setText("  Hate Extends Code");
        
        //Adding Font
        Font font = new Font("Times new roman", Font.ITALIC, 40);
        l.setFont(font);

        add(l); 
    }
}