package Swing;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI9textfill {
    public static void main(String[] args) {
        new saFrame();
    }
}

class saFrame extends JFrame{
    
    JTextField tf1;
    JPasswordField pf;

    public saFrame(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(200, 200);
        setLayout(null);

        tf1 = new JTextField("Write Something...");
        tf1.setBounds(10, 10, 300, 100);
        add(tf1);
        
        pf = new JPasswordField();
        pf.setBounds(10, 200, 300, 50);
        add(pf);

    }
}
