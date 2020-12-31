
package core.java;

/**
 *
 * @author amitguho
 * 11:49 PM
 * 13:02:2020
 */
public class StringPart4 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Amit");
        System.out.println(sb);
        
        sb.append(" guha ");
        sb.append(23);
        
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        sb.delete(0, 5);
        System.out.println(sb);
        
        sb.setLength(2);
        System.out.println(sb);
    }
}
