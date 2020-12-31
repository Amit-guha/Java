
package OOP;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 09.39 PM
 * 19.04.2020
 */
public class ReturnValueTest {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ReturnValue ob=new ReturnValue();//ob create
        int r=ob.square(n);
        System.out.println(r);
    
    }
}
