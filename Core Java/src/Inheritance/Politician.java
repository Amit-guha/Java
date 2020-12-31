
package Inheritance;

/**
 *
 * @author amitguho
 * 10:40 PM
 * 24.04.2020
 */

//One class acquire the other class properties
public class Politician extends Person{
    //Person---->>>Base class//sub class
    //Politician---->>Derived class//super class
    String Power;
    
    void diplay2(){
        display();
        System.out.println("Power ="+Power);
    }
    
}
