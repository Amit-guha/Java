
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 */
public class Factorial {
    public static void main(String[] args) {
       int fact=1;
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        for (int i = n; i >=1 ; i--) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    
}
