
package core.java;

/**
 *
 * @author amitguho
 * 11:20 PM
 * 14:04:2020
 */
public class WrapperClass {
    public static void main(String[] args) {
        //Autoboxing --->>>Primitive data type to Object
        int x=10;
        Integer y=x;
        System.out.println(y);
        
        //Unboxing ---->>>Object to Primitive data type
        Integer n=new Integer(100);
        int i=n;
        System.out.println(i);
    }
   
}
