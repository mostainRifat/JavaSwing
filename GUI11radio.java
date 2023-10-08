package Swing;

//import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI11radio {
    public static void main(String[] args) {
        new tptFrame();
    }
}

class tptFrame extends JFrame implements ActionListener{
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    JLabel l1 , l2 ;
    ButtonGroup bg1,bg2;

    public tptFrame(){
        setTitle("Radia Button");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200 ,340 ,400);
        setLayout(null);

        rb1 = new JRadioButton("Cricket");
        rb2 = new JRadioButton("Football");
        rb3 = new JRadioButton("Baseball");
        rb4 = new JRadioButton("Male");
        rb5 = new JRadioButton("Female");

        l1 = new JLabel(" ");
        l2 = new JLabel(" ");

        bg1 = new ButtonGroup();
        bg2 = new ButtonGroup();

        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);
        bg2.add(rb4);
        bg2.add(rb5);

        rb1.setBounds(10, 10, 400, 35);
        rb2.setBounds(10, 50, 400, 35);
        rb3.setBounds(10, 90, 400, 35);
        rb4.setBounds(10, 160, 400, 35);
        rb5.setBounds(10, 200, 400, 35);

        l1.setBounds(10, 280, 400, 35);
        l2.setBounds(10, 320, 400, 35);

        rb1.setSelected(true);
        rb4.setSelected(true);
        rb3.setEnabled(false);


        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(rb5);

        add(l1);
        add(l2);

        rb1.addActionListener(this);
        rb2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){

        if(rb1.isSelected())
            l1.setText("You Love : Cricket");
        if(rb2.isSelected())
            l1.setText("You Love : Football");
    }
}
