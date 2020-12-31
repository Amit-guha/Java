
package PolyMorphism;

/**
 *
 * @author amitguho
 * 10:28 PM
 * 27.04.2020
 */
public class Test {
    public static void main(String[] args) {
        Area a=new Area();
        System.out.println(a.area());
        
        //dynamic Method dispatching
        //Run time polymorphism
        //reference of super class---->>>object of sub class
        a=new Rectangle(10,10);
        System.out.println(a.area());
        
        
        //dynamic dispatching
        a=new Triangle(10,10);
        System.out.println(a.area());
        
    }
}
