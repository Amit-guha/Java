
package core.java;

/**
 *
 * @author amitguho
 * 11:14 PM
 * 13:04:2020
 */
public class StringPart3 {
    public static void main(String[] args) {
        String x="I love my mother";
        
        System.out.println("Character : "+x.charAt(0));
        System.out.println("ASCII VALUE : "+x.codePointAt(0));
        System.out.println("Index of : "+x.indexOf("my"));
        
        String name=x.replace("I", "i");
        System.out.println("Replacement"+name);
        
        String[] split=x.split(" ");
        for (String string : split) {
            System.out.println(string);
        }
       
        
        System.out.println("");
    }
}
