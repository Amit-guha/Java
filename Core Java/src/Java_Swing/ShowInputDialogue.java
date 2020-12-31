
package Java_Swing;

import javax.swing.JOptionPane;

/**
 *
 * @author amitguho
 * 10:02 AM
 * 03.05.2020
 */
public class ShowInputDialogue {
    public static void main(String[] args) {
       String name1= JOptionPane.showInputDialog(null,"Enter Your First Name :","Message",JOptionPane.QUESTION_MESSAGE);
       String name2= JOptionPane.showInputDialog(null,"Enter Your Last Name :","Message",JOptionPane.QUESTION_MESSAGE);
       
       String FullName=name1.concat(" "+name2);
       JOptionPane.showMessageDialog(null, FullName,"Introduction", JOptionPane.INFORMATION_MESSAGE);
      int code= JOptionPane.showConfirmDialog(null, FullName,"Conformation", 0);
      if(code==JOptionPane.YES_OPTION){
        //  System.exit(code);
          System.exit(0);
      }
      else{
          System.out.println("You select No Option");
      }
       
    }
}
