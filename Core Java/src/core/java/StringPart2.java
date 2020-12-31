
package core.java;

/**
 *
 * @author amitguho
 * 05:20 PM
 * 13.04.2020
 */
public class StringPart2 {
    public static void main(String[] args) {
        String p1="Amit";
        String p2=" guha";
        
        String fullName=p1.concat(p2);
        System.out.println(fullName);
        System.out.println("Upper Case :"+fullName.toUpperCase());
        System.out.println("Lower Case :"+fullName.toLowerCase());
        System.out.println("Starts With :"+p1.startsWith("Am"));
        System.out.println("Ends With:"+p2.endsWith("ha"));
        System.out.println("Contains : "+p1.contains("m"));
        
    }
}
