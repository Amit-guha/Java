
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 */
public class FarenheightToCelcius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double v=input.nextDouble();
        
        double c=(5*v-160)/9;
        System.out.println("Cels = "+c);
        
    }
}
