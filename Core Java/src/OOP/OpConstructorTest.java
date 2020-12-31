
package OOP;

/**
 *
 * @author amitguho
 * 9.21 PM
 * 19.04.2020
 */
public class OpConstructorTest {
    public static void main(String[] args) {
        
        OpConstructor op=new OpConstructor("Android","Male",989898);
        op.display();
        
        OpConstructor op1=new OpConstructor("Android","Male");
        op1.display();
        
        OpConstructor op2=new OpConstructor();
       // op2.display();
        
    }
    
}
