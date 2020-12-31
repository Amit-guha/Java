
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 04.08.2020
 * 11:20 PM
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner input=new Scanner(System.in);
        
        num=input.nextInt();
        int temp=num;
        
        while (temp!=0) {
            int r=temp%10;
            sum=sum+r;
           // sum=sum*10+r;//Reverse number
            temp=temp/10;
        }
        System.out.println("Sum of Digits = "+sum);
        
    }
}
