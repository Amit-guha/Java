
package core.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author amitguho
 * 11:28 AM
 * 13:04:2020
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        ArrayList<Integer>numbers=new ArrayList<>();
        
      // numbers.add(input.nextInt());//Taking input using Scanner class
       numbers.add(20);
       numbers.add(30);
       numbers.add(40);
       numbers.add(3,50);
     
        System.out.println(numbers);
        
       // numbers.remove(3);
       // System.out.println(" "+numbers);
        
       // numbers.removeAll(numbers);
       // System.out.println(numbers);
        // numbers.clear();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.indexOf(50));
        System.out.println(numbers.contains(40));
        
        numbers.set(0,580);
        System.out.println(numbers);
        
        System.out.println(numbers.get(0));
        
    }
}
