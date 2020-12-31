
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 04.08.2020
 * 11:33 PM
 */
public class PalindromeNumber {
    public static void main(String[] args) {
          int num,sum=0;
        Scanner input=new Scanner(System.in);
        
        num=input.nextInt();
        int temp=num;
        
        while (temp!=0) {
            int r=temp%10;
           // sum=sum+r;
            sum=sum*10+r;//Reverse number
           // sum=sum+r*r*r;//Armstorng Number
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("Palindorme Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
        
    }
    
}
