
package Data_Structure;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author amitguho
 * 9:00 PM
 * 30.04.2020
 */
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer>numbers=new LinkedList<>();
        Scanner input=new Scanner(System.in);
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(100);
        numbers.addLast(200);
        numbers.add(1, 9);
        System.out.println(numbers);
        
        numbers.removeFirst();
        System.out.println(numbers);
        
        numbers.remove(1);
     /*   for (int i = 0; i < 3; i++) {
            numbers.add(input.nextInt());
        }
        */
        
        System.out.println(numbers);
    }
}
