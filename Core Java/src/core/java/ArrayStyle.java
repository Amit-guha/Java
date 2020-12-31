
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 10.04.2020
 * 12:44 AM
 */
public class ArrayStyle {
    public static void main(String[] args) {
       // Scanner input=new Scanner(System.in);
        
        int [][] number=new int[4][];
        number[0]=new int[1];
        number[1]=new int[2];
        number[2]=new int[3];
        number[3]=new int[4];
        
        int k=0;
        for (int row = 0; row <4; row++) {
            for (int col = 0; col <row+1; col++) {
                number[row][col]=k;
                k++;
            }
            
        }
        
        for (int row = 0; row <4; row++) {
            for (int col = 0; col <row+1; col++) {
                System.out.print(" "+number[row][col]);
            }
            
            System.out.println("");
            
        }
    }
}
