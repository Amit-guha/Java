
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,result;
        
        System.out.print("Enter the first number = ");
        num1=input.nextInt();
        
        System.out.print("Enter the Second number = ");
        num2=input.nextInt();
        
        System.out.println("Addition = "+(num1+num2));
        System.out.println("Subtraction = "+ (num1-num2));
        System.out.println("Multiplication = "+num1*num2);
        System.out.println("Division = "+((double)num1/num2));
        System.out.println("Reminder = "+num1%num2);
    }
}
