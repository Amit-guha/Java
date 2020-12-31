
package OOP;

/**
 *
 * @author amitguho
 * 10:17 PM
 * 26.04.2020
 */
public class Final {
     final String PROJECT_NAME="ASAR ALO";//final Variable
     final double budget;//Blank final Variable
     static final int PEOPLE;//static blank final Variable
     
     //initialize the static blank final variable
     static{
         PEOPLE=10;
     }
     
     
     //initialize the blank final variable
     Final(){
         budget=1000;
     }
     
     void display(){
         System.out.println(PROJECT_NAME);
         System.out.println(budget);
         System.out.println(PEOPLE);
     }
     
    public static void main(String[] args) {
        Final ob=new Final();
        ob.display();
    }
     
    
}
