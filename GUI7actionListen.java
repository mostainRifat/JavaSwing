package Swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//IMPROVE ACTION LISTENER
import javax.swing.*;

public class GUI7actionListen {
    public static void main(String[] args) {
        new liFrame();
    }
}

class liFrame extends JFrame{

    JButton button1, button2 , button3;
    Container con;

    public liFrame(){
        super("ACTION LISTENER");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(200, 200);
        //Font font = new Font("Times new roman" , Font.BOLD , 13);
        setLayout(null);

        con = getContentPane();


        button1 = new JButton("Red..");
        button1.setBounds(100, 30, 130, 30);
        add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                con.setBackground(Color.red);
            }
        });

        button2 = new JButton("Blue..");
        button2.setBounds(100, 80, 130, 30);
        add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                con.setBackground(Color.blue);
            }
        });

        button3 = new JButton("Black..");
        button3.setBounds(100, 130, 130, 30);
        add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                con.setBackground(Color.black);
            }
        });
    }
}