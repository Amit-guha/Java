
package Inheritance;

/**
 *
 * @author amitguho
 * Related with InstanaceOf2
 */
public class InstanaceOf3 {
    public static void main(String[] args) {
        InstanaceOf i=new InstanaceOf();
        InstanaceOf1 i1=new InstanaceOf1();
        InstanaceOf2 i2=new InstanaceOf2();
        InstanaceOf3 i3=new InstanaceOf3();
        
        System.out.println(i instanceof InstanaceOf);
        System.out.println(i1 instanceof InstanaceOf);
        System.out.println(i2 instanceof InstanaceOf);
        System.out.println(i1 instanceof InstanaceOf2);
        
    }
    
}
