
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 12:05 AM
 * 14:04:2020
 */
public class StringBufferPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String name=input.nextLine();
        //System.out.println(name
        
        StringBuffer sb=new StringBuffer(name);
        String s=sb.reverse().toString();
        if(name.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
