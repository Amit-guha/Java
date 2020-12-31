
package OOP;

import java.text.DecimalFormat;

/**
 *
 * @author amitguho
 * 12:57 AM
 */
public class decimalformat {
    public static void main(String[] args) {
        DecimalFormat ob=new DecimalFormat("0.000");
        double x=3.141516;
        System.out.println(ob.format(x));
    }
}
