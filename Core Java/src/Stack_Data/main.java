
package Stack_Data;

/**
 *
 * @author amitguho
 * 08:55 PM
 * 28.06.2020
 */

//Implementation of Stack
public class main {
    public static void main(String[] args) {
      stack s=new stack();
      s.push(10);
      s.push(11);
      System.out.println("is the stack empty : "+s.Emtpy());
      System.out.println("Peek Element : "+s.peek());
     
      System.out.println("Pop element : "+s.pop());
     
      System.out.println("Size is : "+s.size());
      s.show();
    }
    
}
