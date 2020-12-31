package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author amitguho 11:17 AM 29.04.2020
 */
public class Exp {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter num1: ");
                int a = input.nextInt();

                System.out.print("Please enter num2: ");
                int b = input.nextInt();

                int num = a / b;
                System.out.println("Result:" + a + "/" + b + " = " + num);

            } catch (Exception e) {
                System.out.println("Exception : " + e);
                System.out.println("You must enter an integer.Please try again");
            }
        }
    }
}
