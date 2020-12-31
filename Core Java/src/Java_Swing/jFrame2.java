
package Java_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author amitguho
 * 12:19 PM
 * 04.05.2020
 */
public class jFrame2 extends JFrame {
    private ImageIcon icon;
    private Container content;
    private JLabel label,Slabel,imgLabel;
    private Font f;
    jFrame2(){
        init();
    }
    public void init(){
        // BackGround-->>Color
        content=this.getContentPane();
        content.setLayout(null);//set for JLabel
        content.setBackground(Color.orange);
        
        // icon
        icon=new ImageIcon(getClass().getResource("amit.png"));//set the icon
        this.setIconImage(icon.getImage());
        
        //Add font
        f=new Font("Arial",Font.ITALIC,14);
        
        
        //JLabel
        label=new JLabel();
        label.setText("COVID-19");
        label.setBounds(50, 20, 150, 50);
        label.setFont(f);//set font in JLabel
        
        //Foreground && Background Color
        label.setForeground(Color.red);
        //label.setOpaque(true);
       // label.setBackground(Color.blue);
       
       label.setToolTipText("COVID-19");//Set tooltip text
        content.add(label);
        
        //Multiple JLabel
        Slabel=new JLabel("CORONA VIRUS");
        Slabel.setBounds(50, 70, 150, 50);
        Slabel.setFont(f);//set font in JLabel
        
         //Foreground && Background Color
        Slabel.setForeground(Color.red);
        //label.setOpaque(true);
       // label.setBackground(Color.blue);
       
        content.add(Slabel);
        
        //ImageLabel
        imgLabel=new JLabel("May",icon,JLabel.CENTER);
        imgLabel.setBounds(50, 120, icon.getIconWidth(),icon.getIconHeight());
        content.add(imgLabel);
        
        
    }
    public static void main(String[] args) {
        jFrame2 to=new jFrame2();
        to.setVisible(true);//By default JFrame not shown
        to.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when click on the x sign,The program is stopped
        //frame.setSize(400, 300);
       // frame.setLocationRelativeTo(null);//--->>Show center of the screen
       // frame.setLocation(200, 100);
      to.setBounds(200, 200, 400, 300);
      to.setTitle("JFRAME");
      
    
       // frame.setResizable(false);
    }
}
