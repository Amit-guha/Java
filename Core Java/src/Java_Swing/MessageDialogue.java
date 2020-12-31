
package Java_Swing;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author amitguho
 * 12:16 AM
 * 03.05.2020
 */
public class MessageDialogue {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Wrong Message");//--->>>location center and give me a message
       // JOptionPane.showMessageDialog(null,"Wrong Message","Warning",JOptionPane.ERROR_MESSAGE);
        //The last two parameter describes the title and icon
        ImageIcon icon=new ImageIcon("amit.png");
        JOptionPane.showMessageDialog(null,"Wrong Message", "Warning", JOptionPane.PLAIN_MESSAGE, icon);
    }
}
