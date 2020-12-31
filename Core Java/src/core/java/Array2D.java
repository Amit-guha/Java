
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 10.04.2020
 * 12:20 AM
 */
public class Array2D {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int [][] number=new int[3][3];
        for (int row = 0; row <3; row++) {
            for (int col = 0; col <3; col++) {
                number[row][col]=input.nextInt();
            }
        }
        
        //print
         for (int row = 0; row <3; row++) {
            for (int col = 0; col <3; col++) {
                System.out.print(" "+number[row][col]);
            }
             System.out.println();
        }
        
    }
}
