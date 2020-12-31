
package Data_Structure;

import java.util.HashMap;

/**
 *
 * @author amitguho
 * 10:18 PM
 * 30.04.2020
 */
public class hasmap {
    public static void main(String[] args) {
        //put,get method
        HashMap<Integer,String>hash=new HashMap<>();
        //Under any key store the value
        
        hash.put(101,"Amit");
        hash.put(102,"Badhun");
        hash.put(103,"Josna");
        
        System.out.println(hash.get(101));
        System.out.println(hash.get(102));
        System.out.println(hash.get(103));
    }
    
}
