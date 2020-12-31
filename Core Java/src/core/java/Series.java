
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 04.08.2020
 * 12:08 PM
 */
public class Series {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input=new Scanner(System.in);
        
        n=input.nextInt();
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
            System.out.print("\t"+sum);
        }
        System.out.println();
        System.out.println(sum);
    }
    
}
