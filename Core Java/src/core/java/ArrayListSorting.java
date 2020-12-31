
package core.java;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author amitguho
 * 04:56 PM
 * 13.04.2020
 */
public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer>digit=new ArrayList<Integer>();
        
        digit.add(10);
        digit.add(-10);
        digit.add(20);
        digit.add(0);
        digit.add(100);
        
        System.out.println(digit);
        
        //Sorting an arrylist------->>>>Ascending Order
        Collections.sort(digit);
        System.out.println(digit);
        
        //Sorting an arraylist------->>>Descending Order
        Collections.sort(digit,Collections.reverseOrder());
        System.out.println(digit);
    }
}
