package Swing;
    
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
    
public class GUI3label{
    public static void main(String[] args){
        new thFrame();
    }
}
  
class thFrame extends JFrame{
    JLabel l = new JLabel("LoveExtendsCode");
    JLabel l2 = new JLabel("Label 2");

    public thFrame(){
        super("MY JAVA");
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //setLocation(200, 200);
        //setSize(400,300);
        //Completes the previos 2 lines at once
        setBounds(200, 200, 400, 300);
        
        //ReWrite the Jlabel
        l.setText("  Hate Extends Code");
        
        //Adding Font
        Font font = new Font("Times new roman", Font.ITALIC, 40);
        l.setFont(font);
        add(l); 
        add(l2);
        //Cant Resize
        setResizable(false);
    }
}