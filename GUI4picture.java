package Swing;
// Adding a picture in the GUI

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class GUI4picture {
    public static void main(String[] args) {
        new mmFrame();
    }
}

class mmFrame extends JFrame{
    JLabel l;
    ImageIcon ii;

    public mmFrame() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400 , 300 );
        setLocation(200, 200);
        //l = new JLabel("Love this code");
        //add(l);

        ii = new ImageIcon("E:\\Wallpaper\\francesco-ungaro-PjQXKcz3dTM-unsplash.jpg");
        l = new JLabel (ii);
        add(l);
        pack();
    }
}