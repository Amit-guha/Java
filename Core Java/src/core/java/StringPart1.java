
package core.java;

/**
 *
 * @author amitguho
 * 05:11 PM
 * 13:04:2020
 */
public class StringPart1 {
    public static void main(String[] args) {
        String part1="Computer Science and Engineering";
        String part2="Computer Science and Engineering";
        
        System.out.println(part1.length());
        System.out.println(part1.contains(part2));
        System.out.println(part1.isEmpty());
        if(part1.equals(part2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
