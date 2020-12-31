
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 04.09.2020
 * 11:51 PM
 */
public class ArrayFirst {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int [] array=new int[5];
        for (int i = 0; i <array.length; i++) {
            array[i]=input.nextInt();//taking input
        }
        
        int sum=0;
        for (int i = 0; i <array.length; i++) {
            sum=sum+array[i];
        }
        
        System.out.println("Summation of five number = "+sum);
        
        int max=array[0];
        int min=array[0];
        for (int i = 1; i <array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
            
            if(min>array[0]){
                min=array[i];
            }
        }
        
        System.out.println("Maximum number = "+max);
        System.out.println("Minimum number = "+min);
    }
    
}
