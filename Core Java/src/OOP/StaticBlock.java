
package OOP;

/**
 *
 * @author amitguho
 * 08.35 PM
 * 21.04.2020
 */
public class StaticBlock {
    
    //static block call before the main method
    static{
        System.out.println("Static Block");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method");
    }
    
}
