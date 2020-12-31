
package core.java;

import java.util.ArrayList;

/**
 *
 * @author amitguho
 * 12:01 PM
 * 13:04:2020
 */
public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> n1=new ArrayList<Integer>();
        ArrayList<Integer> n2=new ArrayList<Integer>();
        
        n1.add(10);
        n1.add(20);
        n1.add(30);
        n1.add(40);
        
        System.out.println(n1);
        n2.addAll(n1);
        System.out.println(n2);
        
        
        System.out.println(n1.equals(n2));
    }
}
