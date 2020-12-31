
package core.java;

/**
 *
 * @author amitguho
 * 12:40 AM
 * 15.04.2020
 */
public class ConversionNumberSystem {
    public static void main(String[] args) {
        //Convert Binary,Octal,Hexadecimal------>>>>>Decimal
        String binary="11";
        Integer Decimal=Integer.parseInt(binary, 2);
        System.out.println(Decimal);
        
        //Octal
         String Octal="07";
        Integer oc=Integer.parseInt(Octal, 8);
        System.out.println(oc);
        
        
         //HexaDecimal
         String hexa="A";
        Integer He=Integer.parseInt(hexa, 16);
        System.out.println(He);
        
        //Decimal to others Number System
        Integer deci=10;
        String s=Integer.toBinaryString(deci);
        System.out.println(s);
    }
}
