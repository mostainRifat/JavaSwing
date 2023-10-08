package Swing;
//ADDING A BUTTON WITH ACTION LISTENER

import java.awt.Color;
//import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI5button {
    public static void main(String[] args) {
        new dqFrame();
    }
}

class dqFrame extends JFrame{

    JButton button;
    JLabel label;

    public dqFrame(){
        super("ADD BUTTON");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(200, 200);
        Font font = new Font("Times new roman" , Font.BOLD , 13);

        setLayout(null);

        button = new JButton("ClickHere...");
        button.setBounds(100, 50, 130, 30);
        button.setFont(font);
        button.setForeground(Color.red);
        button.setBackground(Color.BLACK);
        add (button);

        //Adding an action Listener to the button

        //type 1 Creating Class
        //button.addActionListener(new Arsd());
        //Type 2.. Annonamys class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ee){
                System.out.println("Lets Run");
                // it can only handle instance variable
            }
        }
        );


        label = new JLabel("Hello...");
        label.setFont(font);
        label.setBounds(100, 200, 90, 30);
        add (label);
    }
}

class Arsd implements ActionListener{
    public void actionPerformed(ActionEvent ee){
        System.out.println("Hello Bodda");
    }
}
