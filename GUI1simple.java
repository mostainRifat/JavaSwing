package Swing;
//MAKING JUST A FRAME
import javax.swing.JFrame;

public class GUI1simple {
    public static void main(String[] args) {
         JFrame frame = new JFrame();
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400, 300);
         frame.setLocation(200, 200);
    }
}
