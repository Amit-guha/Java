
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 04.08.2020
 * 12:16 PM
 */
public class DecimelSeries {
    public static void main(String[] args) {
        double n,sum=0;
        Scanner input=new Scanner(System.in);
        n=input.nextDouble();
        
        for (double i = 1.5; i < n; i++) {
            System.out.print(i+" ");
            sum=sum+i;
        }
        System.out.println();
        System.out.println(sum);
       
    }
}
