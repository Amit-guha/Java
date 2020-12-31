
package Java_Swing;

import javax.swing.JFrame;

/**
 *
 * @author amitguho
 * 11:52 AM
 * 04.05.2020
 */
public class jFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        
        frame.setVisible(true);//By default JFrame not shown
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when click on the x sign,The program is stopped
        //frame.setSize(400, 300);
       // frame.setLocationRelativeTo(null);//--->>Show center of the screen
       // frame.setLocation(200, 100);
        frame.setBounds(200, 200, 400, 300);
        frame.setTitle("JFRAME");
       // frame.setResizable(false);
    }
}
