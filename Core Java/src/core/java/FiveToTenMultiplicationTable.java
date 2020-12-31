
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 */
public class FiveToTenMultiplicationTable {
    public static void main(String[] args) {
        int n,m;
        Scanner input=new Scanner(System.in);
        
        n=input.nextInt();
        m=input.nextInt();
        int multi;
        for (int i = n; i <= m; i++) {
            for (int j = 1; j <= 10; j++) {
                multi=i*j;
                System.out.println(i+"X"+j+"="+multi);
            }
            System.out.println("\n\n");
        }
    }
    
}
