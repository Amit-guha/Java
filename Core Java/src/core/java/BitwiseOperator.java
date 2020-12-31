
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 08.04.2020
 * 12:05 AM
 */
public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        
        int c;
         c=a&b;
        System.out.println("a&b = "+c);
         c=a|b;
        System.out.println("a|b = "+c);
         c=a^b;
        System.out.println("a^b = "+c);
        
        c=a>>2;
        System.out.println("a>>2 = "+c);
        
        c=a<<2;
        System.out.println("a<<2 = "+c);
        
        
    }
}
