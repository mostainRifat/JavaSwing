package Swing;
//Change Background color with button

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//IMPROVE ACTION LISTENER
import javax.swing.*;

public class GUI8actioNlisten {
    public static void main(String[] args) {
        new shFrame();
    }
}

class shFrame extends JFrame implements ActionListener{

    JButton button1, button2 , button3;
    Container con;

    public shFrame(){
        super("ACTION LISTENER");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(200, 200);
        //Font font = new Font("Times new roman" , Font.BOLD , 13);
        setLayout(null);

        con = getContentPane();

        button1 = new JButton("Red..");
        button2 = new JButton("Blue..");
        button3 = new JButton("Black..");

        button1.setBounds(120, 30, 100, 30);
        button2.setBounds(120, 80, 100, 30);
        button3.setBounds(120, 130, 100, 30);

        add(button1);    
        add(button2);
        add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1)
            con.setBackground(Color.red);
            
        if (e.getSource() == button2)
            con.setBackground(Color.blue);

        if (e.getSource() == button3)
            con.setBackground(Color.black);  
    }
} 