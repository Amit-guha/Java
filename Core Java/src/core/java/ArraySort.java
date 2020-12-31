
package core.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author amitguho
 * 09:45 PM
 * 12.04.2020
 */
public class ArraySort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] digit=new int [6];
        
        for (int i = 0; i <digit.length; i++) {
            digit[i]=input.nextInt();
        }
        
        Arrays.sort(digit);
        for (int i : digit) {
            System.out.print(" "+i);
        }
        
        System.out.println("");
        for (int i =5; i >=0; i--) {
            System.out.print(" "+digit[i]);
        }
        
        System.out.println("");
        String [] names={"Amit","ma","baba","dada"};
        Arrays.sort(names);
        
        for (String name : names) {
            System.out.print(" "+name);
        }
    }
}
