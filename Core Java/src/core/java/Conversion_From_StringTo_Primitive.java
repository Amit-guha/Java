
package core.java;

/**
 *
 * @author amitguho
 * 11:32 PM
 * 14.04.2020
 */
public class Conversion_From_StringTo_Primitive {
    public static void main(String[] args) {
        int i=9;
        String s=Integer.toString(i);
        System.out.println("String s = "+s);
        
        //String to Any data type
        String str="99";
        int n=Integer.parseInt(str);
        System.out.println(n);
        
    }
}
