
package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho
 */
public class VowelCosonant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char c=input.next().charAt(0);//take input in only first position
        
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='0'||c=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
    
}
