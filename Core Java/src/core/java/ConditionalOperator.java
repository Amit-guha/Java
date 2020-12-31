
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * date : 07.04.2020
 * Time : 12:50 AM
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int num1=input.nextInt();
        
        int choice=(num>num1) ? num : num1;
        System.out.println(choice);
    }
    
}
