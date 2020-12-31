
package Stack_Data;

import java.util.Stack;

/**
 *
 * @author amitguho
 */
public class Build_In_Stack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("{");
        s.pop();
        System.out.println(s.isEmpty());
        System.out.println(s);
    }
}
